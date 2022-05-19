package com.example.scalefusionapidemo.service.impl;

import com.example.scalefusionapidemo.client.properties.ScaleFusionScheduleProperties;
import com.example.scalefusionapidemo.common.model.devices.AllDevicesDTO;
import com.example.scalefusionapidemo.service.ScaleFusionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScaleFusionScheduleJob {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private ScaleFusionService scaleFusionService;

    @Autowired
    private ScaleFusionScheduleProperties scaleFusionScheduleProperties;

    @Scheduled(fixedDelayString = "${all.devices.fetch.fixedDelay.in.milliseconds}")
    public void allDevicesSchedule() {
        final Long deviceId = scaleFusionScheduleProperties.getDeviceId();
        final Long deviceProfileId = scaleFusionScheduleProperties.getDeviceProfileId();
        logger.info("Fetching ScaleFusion devices: Device Id: {}, Device Profile Id: {}, Date: {}.",
                    deviceId,
                    deviceProfileId,
                    LocalDateTime.now());
        AllDevicesDTO allDevices = scaleFusionService.allDevices(deviceId, deviceProfileId);
        System.out.println(allDevices);
    }

}
