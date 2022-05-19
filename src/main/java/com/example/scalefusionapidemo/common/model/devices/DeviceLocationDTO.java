package com.example.scalefusionapidemo.common.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceLocationDTO {

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("lng")
    private String lng;

    @JsonProperty("address")
    private String address;

    @JsonProperty("date_time")
    private Long dateTme;

    @JsonProperty("created_at")
    private String createdAt;

}
