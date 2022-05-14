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
