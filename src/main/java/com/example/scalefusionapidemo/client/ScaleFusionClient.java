package com.example.scalefusionapidemo.client;

import com.example.scalefusionapidemo.common.model.base.ApiResponseModel;
import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.common.model.reports.ScreenTimeUsagesReportDTO;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Optional;

public interface ScaleFusionClient {

    ApiResponseModel<Optional<AllDevicesDTO>> fetchAllDevices(Long cursor, Long deviceProfileId);

    ApiResponseModel<Optional<ScreenTimeUsagesReportDTO>> fetchScreenTimeUsage(Long page,
                                                                               Long[] deviceIds,
                                                                               Long[] deviceGroupIds,
                                                                               @NonNull LocalDate fromDate,
                                                                               @NonNull LocalDate toDate);

}

