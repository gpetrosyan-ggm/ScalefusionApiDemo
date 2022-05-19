package com.example.scalefusionapidemo.common.model.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceUsagesDTO {

    @JsonProperty("active_duration")
    private Double activeDuration;

    @JsonProperty("idle_duration")
    private Double idleDuration;

    @JsonProperty("avg_active_duration")
    private Integer avgActiveDuration;

    @JsonProperty("avg_idle_duration")
    private Integer avgIdleDuration;

    @JsonProperty("total_duration")
    private Integer totalDuration;

    @JsonProperty("most_used_application")
    private String mostUsedApplication;

    @JsonProperty("most_used_application_duration")
    private Double mostUsedApplicationDuration;

}
