package com.hafidzniioman;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("**************");

        do {
            System.out.println("Count value is " + count);
            count++;

            if (count > 10) {
                break;
            }
        } while (count != 6);
/*

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
*/
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total Even Number  found " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
