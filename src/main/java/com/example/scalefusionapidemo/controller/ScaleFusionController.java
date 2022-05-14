package com.example.scalefusionapidemo.controller;

import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.common.model.reports.ScreenTimeUsagesReportDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@RequestMapping(path = "/scalefusion/demo")
public interface ScaleFusionController {

    @GetMapping(path = "/devices")
    ResponseEntity<AllDevicesDTO> allDevices(
            @RequestParam(value = "cursor", required = false) Long id,
            @RequestParam(value = "deviceProfileId", required = false) Long deviceProfileId
    );

    @GetMapping(path = "/screen/report")
    ResponseEntity<ScreenTimeUsagesReportDTO> screenReport(
            @RequestParam(value = "page", required = false) Long page,
            @RequestParam(value = "deviceIds", required = false) Long[] deviceIds,
            @RequestParam(value = "deviceGroupIds", required = false) Long[] deviceGroupIds,
            @RequestParam(value = "fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
            @RequestParam(value = "toDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate
    );

}
