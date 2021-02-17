package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFinder {

    /* method takes an array, subtracts its content from the List made of the whole range, then numbers smaller
    than 1 are thrown out from the List, and then the smallest number is returned */

    public int smallestPositiveNumberInTheCollection(int[] table) {

        List<Integer> listFromTable = Arrays.stream(table).boxed().collect(Collectors.toList());
        ArrayList<Integer> wholeRange = new ArrayList<>(100005);
        for (int i = 1 ; i <= 100000 ; i++)
        {
            wholeRange.add(i);
        }

        wholeRange.removeAll(listFromTable);    //from now on wholeRange contains only numbers that weren't in the array
        return Collections.min(wholeRange);
    }

}
