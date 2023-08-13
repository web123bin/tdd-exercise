package com.bin.tdd;

public class Calculator {
    public int sum(int start, int end) {
        if (start == end) {
            return start + end;
        }
        if (start > end) {
            return sum(end, start);
        }
        int size = end - start + 1;
        return (start + end) * size / 2;
    }
}
