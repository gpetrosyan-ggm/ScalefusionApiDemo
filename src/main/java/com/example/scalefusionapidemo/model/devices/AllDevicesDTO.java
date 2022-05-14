package com.example.scalefusionapidemo.model.devices;

import com.example.scalefusionapidemo.model.error.ErrorDTO;
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
