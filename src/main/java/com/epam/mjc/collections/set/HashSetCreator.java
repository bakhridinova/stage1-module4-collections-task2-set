package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (Integer integer : sourceList) {
            integerHashSet.addAll(decideWhichMethodToCall(integer));
        }

        return integerHashSet;
    }

    private List<Integer> decideWhichMethodToCall(int n) {
        if (n % 2 == 0) {
            return divideUntilOdd(n);
        }
        return multiplyByTwo(n);
    }

    private List<Integer> divideUntilOdd(int n) {
        List<Integer> integerList = new ArrayList<>();
        while (true) {
            if (n % 2 == 1) {
                integerList.add(n);
                break;
            }
            integerList.add(n);
            n /= 2;
        }
        return integerList;
    }

    private List<Integer> multiplyByTwo(int n) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(n); integerList.add(n * 2);
        return integerList;
    }
}
