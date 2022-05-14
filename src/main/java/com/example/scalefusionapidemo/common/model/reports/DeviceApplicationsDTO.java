package com.example.scalefusionapidemo.common.model.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceApplicationsDTO {

    @JsonProperty("package")
    private String packageName;

    @JsonProperty("rank")
    private Long rank;

    @JsonProperty("active_duration")
    private Double activeDuration;

}
