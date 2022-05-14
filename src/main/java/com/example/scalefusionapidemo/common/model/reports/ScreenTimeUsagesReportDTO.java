package com.example.scalefusionapidemo.common.model.reports;

import com.example.scalefusionapidemo.common.model.error.ErrorDTO;
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
public class ScreenTimeUsagesReportDTO extends ErrorDTO {

    @JsonProperty("devices")
    private List<DeviceScreenReportDTO> devices;

    @JsonProperty("total_count")
    private Long totalCount;

    @JsonProperty("current_page")
    private Long currentPage;

    @JsonProperty("prev_page")
    private Long prevPage;

    @JsonProperty("next_page")
    private Long nextPage;

    @JsonProperty("total_pages")
    private Long totalPages;

}
