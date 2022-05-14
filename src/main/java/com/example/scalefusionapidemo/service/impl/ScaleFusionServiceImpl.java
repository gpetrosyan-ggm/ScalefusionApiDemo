package com.example.scalefusionapidemo.service.impl;

import com.example.scalefusionapidemo.client.ScaleFusionClient;
import com.example.scalefusionapidemo.model.base.ApiResponseModel;
import com.example.scalefusionapidemo.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.model.reports.ScreenTimeUsagesReportDTO;
import com.example.scalefusionapidemo.service.ScaleFusionService;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ScaleFusionServiceImpl implements ScaleFusionService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private ScaleFusionClient scaleFusionClient;

    @Override
    public AllDevicesDTO allDevices(final Long id, final Long deviceProfileId) {
        ApiResponseModel<Optional<AllDevicesDTO>> responseModel =
                scaleFusionClient.fetchAllDevices(id, deviceProfileId);
        if (BooleanUtils.toBoolean(responseModel.getHasException())) {
            logger.error(responseModel.getExceptionMessage());
            return emptyDevicesRecord();
        }
        return responseModel.getResponse().orElse(emptyDevicesRecord());
    }

    @Override
    public ScreenTimeUsagesReportDTO screenReport(final Long page,
                                                  final Long[] deviceIds,
                                                  final Long[] deviceGroupIds,
                                                  final LocalDate fromDate,
                                                  final LocalDate toDate) {
        ApiResponseModel<Optional<ScreenTimeUsagesReportDTO>> responseModel =
                scaleFusionClient.fetchScreenTimeUsage(page, deviceIds, deviceGroupIds, fromDate, toDate);
        if (BooleanUtils.toBoolean(responseModel.getHasException())) {
            logger.error(responseModel.getExceptionMessage());
            return emptyScreenReportRecord();
        }
        return responseModel.getResponse().orElse(emptyScreenReportRecord());
    }

    private AllDevicesDTO emptyDevicesRecord() {
        AllDevicesDTO allDevices = new AllDevicesDTO();
        allDevices.setCode(404L);
        allDevices.setErrorMessage("Record not found.");
        return allDevices;
    }

    private ScreenTimeUsagesReportDTO emptyScreenReportRecord() {
        ScreenTimeUsagesReportDTO screenReport = new ScreenTimeUsagesReportDTO();
        screenReport.setCode(404L);
        screenReport.setErrorMessage("Record not found.");
        return screenReport;
    }

}
