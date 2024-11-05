package com.ohgiraffers.kenkins.dto;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;

    private int sum;
}
