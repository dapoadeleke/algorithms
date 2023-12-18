package amazon;

import java.util.*;

public class EducativeIO {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

//        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(4, 8, 15, 19));
//        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(7, 9, 10, 16));
//        LinkedList<Integer> resultList = mergeAndSortLists(list1, list2);
//        System.out.println("Result: " + Arrays.toString(resultList.toArray()));
//        String[] dictionary = new String[]{
//                "apple",
//                "apple",
//                "pear",
//                "pie"
//        };
//        String word = "pearapple";
//        System.out.println(canSegmentString(dictionary, word));
    }

    /*
        * Find the missing number in the array
        You are given an array of positive numbers from 1 to n,
        such that all numbers from 1 to n are present except one number x.
        You have to find x. The input array is not sorted.
     */
    static int findMissingNumber(int[] numbers) {
        int sum = 0, availableSum = 0;
        for (int i = 1; i <= (numbers.length + 1); i++) {
            if (i <= numbers.length)
                availableSum += numbers[i-1];
            sum += i;
        }
        return sum - availableSum;
    }

    /*
        * Determine if the sum of two integers is equal to the given value
        Given an array of integers and a value, determine if there are any two integers
        in the array whose sum is equal to the given value. Return true if the sum exists and return false if it does not
     */
    static boolean isSumAvailable(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = (i+1); j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target)
                    return true;
            }
        }
        return false;
    }

    static boolean isSumAvailable2(int[] numbers, int target) {
        HashSet<Integer> foundValues = new HashSet<Integer>();
        for (int number: numbers) {
            foundValues.add(number);
            if (foundValues.contains(target - number))
                return true;
        }
        return false;
    }

    /*
        * Merge two sorted linked lists
        Given two sorted linked lists, merge them so that the resulting linked list is also sorted
     */
    static LinkedList<Integer> mergeAndSortLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> resultList = new LinkedList<Integer>();
        while (!list1.isEmpty() || !list2.isEmpty()) {
            if (list1.isEmpty()) {
                resultList.addAll(list2);
                return resultList;
            } else if (list2.isEmpty()) {
                resultList.addAll(list1);
                return resultList;
            }
            if (list1.getFirst() < list2.getFirst()) {
                resultList.add(list1.removeFirst());
            } else if (list2.getFirst() < list1.getFirst()) {
                resultList.add(list2.removeFirst());
            } else {
                resultList.add(list1.removeFirst());
                resultList.add(list2.removeFirst());
            }
        }
        return resultList;
    }

    static boolean canSegmentString(String[] dictionary, String word) {
        HashSet<String> dict = new HashSet<>(Arrays.asList(dictionary));
        String found = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = (i+1); j < word.length(); j++) {
                String w = word.substring(i, j+1);
                if (dict.contains(w)) {
                    found += w;
                }
            }
        }
        return word.equals(found);
    }

}
