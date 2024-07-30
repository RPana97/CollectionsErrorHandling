package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List <Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(1);

        System.out.println ("Array List: " + integers);

        Set<Integer> uniqueIntegers = new HashSet<>(integers);

        System.out.println ("Hash set: " + uniqueIntegers);

        int sum = 0;
        double average = 0.0;

        try {
            for (int number : uniqueIntegers) {
                sum += number;
            }

            if (uniqueIntegers.isEmpty()) {
                throw new ArithmeticException("Cannot calculate average from an empty list.");
            }
            average = (double)sum / uniqueIntegers.size();
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception :" +e.getMessage());
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println("Exception :" +e.getMessage());
        }

        try {
            // This will cause an IndexOutOfBoundsException
            int invalidList = integers.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: Attempted to access an invalid list.");
        }

        try {
            // This will cause an IllegalArgumentException
            List<Integer> emptyList = new ArrayList<>();
            if (emptyList.isEmpty()) {
                throw new IllegalArgumentException("List cannot be empty");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}