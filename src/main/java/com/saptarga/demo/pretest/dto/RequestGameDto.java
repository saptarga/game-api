package com.saptarga.demo.pretest.dto;

import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestGameDto {

    private String matchDate;
    private String team1;
    private String team2;
    private String stadium;
}
