package com.ohgiraffers.kenkins.service;

import com.ohgiraffers.kenkins.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNumbers(CalculatorDTO dto) {
        return dto.getNum1() + dto.getNum2();
    }
}
