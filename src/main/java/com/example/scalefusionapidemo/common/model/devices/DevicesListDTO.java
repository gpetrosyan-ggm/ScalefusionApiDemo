package com.example.scalefusionapidemo.common.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DevicesListDTO {

    @JsonProperty("device")
    private DeviceDTO device;

}
