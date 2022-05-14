package com.example.scalefusionapidemo.service;

import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.common.model.reports.ScreenTimeUsagesReportDTO;

import java.time.LocalDate;

public interface ScaleFusionService {

    AllDevicesDTO allDevices(Long id, Long deviceProfileId);

    ScreenTimeUsagesReportDTO screenReport(Long page,
                                           Long[] deviceIds,
                                           Long[] deviceGroupIds,
                                           LocalDate fromDate,
                                           LocalDate toDate);

}
