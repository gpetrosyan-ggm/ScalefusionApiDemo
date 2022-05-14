package com.example.scalefusionapidemo.common.model.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceScreenReportDTO {

    @JsonProperty("device_id")
    private Long deviceId;

    @JsonProperty("device_usages")
    private DeviceUsagesDTO deviceUsages;

    @JsonProperty("applications")
    private List<DeviceApplicationsDTO> applications;

}
