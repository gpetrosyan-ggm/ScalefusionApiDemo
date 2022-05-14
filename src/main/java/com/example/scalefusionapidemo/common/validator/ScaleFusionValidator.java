package com.example.scalefusionapidemo.common.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class ScaleFusionValidator {

    public void validate(final LocalDate fromDate, final LocalDate toDate) {
        Assert.notNull(fromDate, "From Date can not be null.");
        Assert.notNull(toDate, "To Date can not be null.");
        Assert.isTrue(!toDate.isBefore(fromDate), "From Date must not be greater than To Date");

        LocalDateTime pastRange = LocalDateTime.now().minusMonths(3);
        Assert.isTrue(fromDate.atStartOfDay().isAfter(pastRange),
                      String.format("From Date is too past, should be greater than '%s'.", pastRange));

        Assert.isTrue(!toDate.minusMonths(1).isAfter(fromDate),
                      "Selected date range must be less than or equals to '1 month'");
    }

}
