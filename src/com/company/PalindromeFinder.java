package com.company;

public class PalindromeFinder {

    public void isThisWordPalindrome(String word) {
        String wordBeingChecked = word.trim().toLowerCase();
        String wordAfterReversing = new StringBuilder(wordBeingChecked).reverse().toString();
        if (wordBeingChecked.equals(wordAfterReversing)) {
            System.out.println("Word " + word + " is a palindrome");
        } else {
            System.out.println("Word " + word + " is not a palindrome");
        }

    }

}