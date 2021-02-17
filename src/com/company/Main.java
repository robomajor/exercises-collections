package com.company;

public class Main {

    public static void main(String[] args) {

        int[] A = new int[] {-80, -70, -10, 0, 1, 11, 15, 7, 13, 11, 22};       //2
        int[] B = new int[] {-1, 1, 2, 3};          //4
        int[] C = new int[] {0, 1, 2, 3, 4, 6};     //5

        CollectionFinder finder = new CollectionFinder();

        System.out.println("Smallest positive number in collection A is " + finder.smallestPositiveNumberInTheCollection(A));
        System.out.println("Smallest positive number in collection B is " + finder.smallestPositiveNumberInTheCollection(B));
        System.out.println("Smallest positive number in collection C is " + finder.smallestPositiveNumberInTheCollection(C));

        System.out.println();

        int sum = 5;
        ComponentsFinder componentsFinder = new ComponentsFinder();

        System.out.print("In collection C ");
        componentsFinder.twoComponentsFinder(C, sum);
        System.out.print("In collection A ");
        componentsFinder.twoComponentsFinder(A, sum);

        System.out.println();

        String[] array1 = new String[] {"Lorem", "ipsum", "dolor", "sit", "amet"};
        String[] array2 = new String[] {"Vivamus", "condimentum", "pulvinar", "ex", "nec", "ultrices"};
        String[] array3 = new String[] {"Aenean", "accumsan", "felis", "id", "tristique", "mollis"};

        CollectionReverser collectionReverser = new CollectionReverser();

        collectionReverser.reverseCollection(array1);
        collectionReverser.reverseCollection(array2);
        collectionReverser.reverseCollection(array3);

    }
}
