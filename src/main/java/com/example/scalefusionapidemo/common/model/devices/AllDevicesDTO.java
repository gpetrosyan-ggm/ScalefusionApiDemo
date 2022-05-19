package com.example.scalefusionapidemo.common.model.devices;

import com.example.scalefusionapidemo.common.model.error.ErrorDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllDevicesDTO extends ErrorDTO {

    @JsonProperty("total_count")
    private Long totalCount;

    @JsonProperty("current_cursor")
    private Long currentCursor;

    @JsonProperty("next_cursor")
    private Long nextCursor;

    @JsonProperty("devices")
    private List<DevicesListDTO> devices;

}
