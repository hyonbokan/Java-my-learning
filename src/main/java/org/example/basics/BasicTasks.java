package org.example.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicTasks {
    public static List<Integer> toEvenNums(List<Integer> nums) {
        return nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}
