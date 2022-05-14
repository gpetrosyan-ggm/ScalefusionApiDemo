package com.example.scalefusionapidemo.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
