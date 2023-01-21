package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public static Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstCopy = new HashSet<>(firstSet);
        Set<String> secondCopy = new HashSet<>(secondSet);
        Set<String> thirdCopy = new HashSet<>(thirdSet);
        firstSet.retainAll(secondCopy);
        firstSet.removeAll(thirdCopy);
        thirdSet.removeAll(firstCopy);
        thirdSet.removeAll(secondCopy);
        thirdSet.addAll(firstSet);
        System.out.println(thirdSet);
        return thirdSet;
    }

    public static void main(String[] args) {
        createSetCombination(new HashSet<>(Set.of("Java", "Collection",  "framework", "interface", "class", "Queue")),
                new HashSet<>(Set.of("Queue", "iterator", "Java", "Collection","comparator")),
                new HashSet<>(Set.of("Java", "Set", "Map", "List")));
    }
}
