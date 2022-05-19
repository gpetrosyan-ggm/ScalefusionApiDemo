package com.example.scalefusionapidemo.common.model.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceApplicationsDTO {

    @JsonProperty("package")
    private String packageName;

    @JsonProperty("rank")
    private Long rank;

    @JsonProperty("active_duration")
    private Double activeDuration;

}
