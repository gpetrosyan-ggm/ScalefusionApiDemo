package com.example.scalefusionapidemo.common.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeviceStorageDTO {

    @JsonProperty("total_internal_storage_avbl")
    private Long totalInternalStorageAvbl;

    @JsonProperty("total_external_storage_avbl")
    private Long totalExternalStorageAvbl;

    @JsonProperty("total_internal_storage")
    private Long totalInternalStorage;

    @JsonProperty("total_external_storage")
    private Long totalExternalStorage;

}
