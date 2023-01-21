package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (Integer integer : sourceList) {
            int square = square(integer);
            if (lowerBound <= square
                    && square <= upperBound) {
                integerHashSet.add(square);
            }
        }
        return integerHashSet;
    }

    private int square(int n) {
        return (int) Math.pow(n, 2);
    }
}
