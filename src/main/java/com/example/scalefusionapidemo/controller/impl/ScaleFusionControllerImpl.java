package com.example.scalefusionapidemo.controller.impl;

import com.example.scalefusionapidemo.common.validator.ScaleFusionValidator;
import com.example.scalefusionapidemo.controller.ScaleFusionController;
import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.common.model.reports.ScreenTimeUsagesReportDTO;
import com.example.scalefusionapidemo.service.ScaleFusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ScaleFusionControllerImpl implements ScaleFusionController {

    @Autowired
    private ScaleFusionService scaleFusionService;

    @Autowired
    private ScaleFusionValidator scaleFusionValidator;

    @Override
    public ResponseEntity<AllDevicesDTO> allDevices(final Long id, final Long deviceProfileId) {
        return new ResponseEntity<>(scaleFusionService.allDevices(id, deviceProfileId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ScreenTimeUsagesReportDTO> screenReport(final Long page,
                                                                  final Long[] deviceIds,
                                                                  final Long[] deviceGroupIds,
                                                                  final LocalDate fromDate,
                                                                  final LocalDate toDate) {
        scaleFusionValidator.validate(fromDate, toDate);
        return new ResponseEntity<>(scaleFusionService.screenReport(page, deviceIds, deviceGroupIds, fromDate, toDate),
                                    HttpStatus.OK);
    }

}
