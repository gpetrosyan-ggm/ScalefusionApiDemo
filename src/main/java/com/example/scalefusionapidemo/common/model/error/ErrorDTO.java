package com.example.scalefusionapidemo.common.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO {

    @JsonProperty("code")
    private Long code;

    @JsonProperty("error_message")
    private String errorMessage;

}
