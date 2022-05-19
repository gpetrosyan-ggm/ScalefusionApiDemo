package com.example.scalefusionapidemo.common.model.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceScreenReportDTO {

    @JsonProperty("device_id")
    private Long deviceId;

    @JsonProperty("device_usages")
    private DeviceUsagesDTO deviceUsages;

    @JsonProperty("applications")
    private List<DeviceApplicationsDTO> applications;

}
