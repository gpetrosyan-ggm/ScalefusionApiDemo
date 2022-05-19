package com.example.scalefusionapidemo.client.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ScaleFusionScheduleProperties {

    @Value("${all.devices.fetch.device.id:}")
    private Long deviceId;

    @Value("${all.devices.fetch.device.profile.id:}")
    private Long deviceProfileId;

}

