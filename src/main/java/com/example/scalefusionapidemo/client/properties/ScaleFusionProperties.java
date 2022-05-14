package com.example.scalefusionapidemo.client.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ScaleFusionProperties {

    @Value("${scalefusion.api.developer.key}")
    private String developerKey;

    @Value("${scalefusion.api.root.uri}")
    private String rootUri;

    @Value("${scalefusion.api.device.management.path}")
    private String deviceManagementPath;

    @Value("${scalefusion.api.reports.screen.time.usages.path}")
    private String reportsScreenTimeUsagesPath;

}

