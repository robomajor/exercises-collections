package com.company;

public class ComponentsFinder {

    public void twoComponentsFinder (int[] array ,int sum) {

        int a, b;
        for (int i=0; i < array.length-1 ; i++) {
            a = array[i];
            b = sum - a;
            for (int j=i+1; j < array.length; j++) {
                if (b == array[j]) {
                    System.out.println("numbers " + a + " and " + b + " sums up to " + sum);
                }
            }
        }
    }
}
