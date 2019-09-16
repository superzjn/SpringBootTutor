package com.example.demo.modal;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class TwoSumPost {

    private List<Integer> numbers;
    private Integer sum;
}
