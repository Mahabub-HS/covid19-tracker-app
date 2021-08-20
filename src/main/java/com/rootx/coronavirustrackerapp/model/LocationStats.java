package com.rootx.coronavirustrackerapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class LocationStats {
    private String state;
    private String country;
    private long latestTotalCases;
    private long differentFromPreviousDay;


}
