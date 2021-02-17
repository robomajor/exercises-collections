package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionReverser {

    public void reverseCollection(String[] text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text));
        System.out.println("Collection before changes - " + words);
        Collections.reverse(words);        //odwracanie kolekcji
        System.out.println("Collection after changes - " + words);
        System.out.println();
    }

}
