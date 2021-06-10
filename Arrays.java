package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Arrays arr = new Arrays();
        arr.Solution();
    }

    public void Solution() {
        int[] ary = new int[]{32, 44, 33, 44, 33, 22};
        for (int i = 0; i < ary.length; i++) {
            System.out.println("Marks:" + ary[i]);
        }

        System.out.println("After updating ary index[0-5]");
        ary[0]=103;
        ary[1]=193;
        ary[2]=123;
        ary[3]=153;
        ary[4]=135;
        ary[5]=147;


            System.out.println("Calculate Total");
            int count = 0;
            for (int total : ary) {
                count = count + total;
                System.out.println("total marks :"+count);
            }
        }
    }