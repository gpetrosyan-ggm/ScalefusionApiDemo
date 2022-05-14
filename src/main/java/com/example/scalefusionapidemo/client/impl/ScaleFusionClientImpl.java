package com.example.scalefusionapidemo.client.impl;

import com.example.scalefusionapidemo.client.BaseClient;
import com.example.scalefusionapidemo.client.ScaleFusionClient;
import com.example.scalefusionapidemo.client.properties.ScaleFusionProperties;
import com.example.scalefusionapidemo.common.model.base.ApiResponseModel;
import com.example.scalefusionapidemo.common.model.base.Pair;
import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.common.model.reports.ScreenTimeUsagesReportDTO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ScaleFusionClientImpl implements ScaleFusionClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private BaseClient baseClient;

    @Autowired
    private ScaleFusionProperties scaleFusionProperties;

    @Override
    public ApiResponseModel<Optional<AllDevicesDTO>> fetchAllDevices(Long cursor, Long deviceProfileId) {
        logger.info("Fetching all devices data. Cursor: {}, Device Profile Id: {}.", cursor, deviceProfileId);
        List<Pair<String, Object>> params = Arrays.asList(Pair.of("cursor", cursor),
                                                          Pair.of("device_profile_id", deviceProfileId));
        return baseClient.getRequest(scaleFusionProperties.getRootUri(),
                                     scaleFusionProperties.getDeviceManagementPath(),
                                     params,
                                     baseClient.defaultHeaderParams(true, scaleFusionProperties.getDeveloperKey()),
                                     AllDevicesDTO.class);
    }

    @Override
    public ApiResponseModel<Optional<ScreenTimeUsagesReportDTO>> fetchScreenTimeUsage(Long page,
                                                                                      Long[] deviceIds,
                                                                                      Long[] deviceGroupIds,
                                                                                      LocalDate fromDate,
                                                                                      LocalDate toDate) {
        logger.info(
                "Fetching screen time usages. Page: {}, Device Ids: {}, Device Group ids: {}, From Date: {}, To Date: {}.",
                page,
                deviceIds,
                deviceGroupIds,
                fromDate,
                toDate);
        List<Pair<String, Object>> params = Arrays.asList(Pair.of("page", page),
                                                          Pair.of("device_ids", StringUtils.join(deviceIds, ",")),
                                                          Pair.of("device_group_ids",
                                                                  StringUtils.join(deviceGroupIds, ",")),
                                                          Pair.of("from_date", fromDate),
                                                          Pair.of("to_date", toDate));
        return baseClient.getRequest(scaleFusionProperties.getRootUri(),
                                     scaleFusionProperties.getReportsScreenTimeUsagesPath(),
                                     params,
                                     baseClient.defaultHeaderParams(true, scaleFusionProperties.getDeveloperKey()),
                                     ScreenTimeUsagesReportDTO.class);
    }

}
