package com.example.scalefusionapidemo.common.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceProfileDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

}
