package com.example.demo.service;


import com.example.demo.modal.NumberPair;
import com.example.demo.repository.NumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class SumService {

    @Autowired
    NumbersRepository numbers;

    public List<NumberPair> findNumbers(String input) {

        List<Integer> numberArray = numbers.getNumbers();

        List<NumberPair> pairs = new ArrayList<>();

        for (int i = 0; i < numberArray.size() - 1; i++) {

            for (int j = i + 1; j < numberArray.size(); j++) {

                if (numberArray.get(i) + numberArray.get(j) == Integer.parseInt(input)) {
                    List<Integer> numbers = Arrays.asList(numberArray.get(i), numberArray.get(j));
                    pairs.add(new NumberPair(numbers));

                }
            }
        }
        return pairs;
    }
}
