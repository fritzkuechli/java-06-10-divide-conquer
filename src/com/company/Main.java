package com.company;
import javax.crypto.spec.PSource;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int size = 100;
        ArrayList<Integer> listTwo = new ArrayList<>();
        Integer [] list = new Integer[]{15, 9, 8, 1, 4, 11, 7, 12, 13, 6,20,5, 3, 16, 2, 10, 14};
        int sizeList = list.length;
        int value;
        boolean swapped;
        Random rand = new Random();
        Set<Integer> set = new HashSet<Integer>();

        // hm not randomized
        while (set.size() != size) {
            set.add(rand.nextInt(size + 1));
        }

        listTwo.addAll(set);

       /* for (int i : listTwo) {
            System.out.println(i);
        }*/



        System.out.println("The maximum is the element furthest to the right..." + recursiveMax(list));


    }

    // divide & conquer
    public static int recursiveMax(Integer [] a) {
        int max = 0;

        if (a.length > 2) {

            Integer [] x = Arrays.copyOfRange(a, 0 , a.length / 2 );
            Integer [] y = Arrays.copyOfRange(a, a.length / 2, a.length);

            if (recursiveMax(x) > recursiveMax(y)){
                max = recursiveMax(x);
            } else {
                max = recursiveMax(y);
            }

        } else if ( a.length == 1){
            max = a[0];
        } else {

            if (a[0] > a[1]){
                max = a[0];
            } else {
                max = a[1];
            }
        }
        return max;
    }
}
