package com.example.demo.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Repository
public class NumbersRepository {

    List<Integer> numbers;

    public NumbersRepository() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
