package com.saptarga.demo.pretest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGameDto {

    private String mDate;
    private String team1;
    private String team2;
    private String stadium;
}
