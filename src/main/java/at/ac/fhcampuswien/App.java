package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar (int days, int begin){
        int count = 0;
        int current = 0;
        if(begin!=1){
            for (int j = 1; j < begin; j++)
                System.out.print("   ");
        }
        count = begin - 1;
        for (int i = 1; i <= days; i++){
            count++;
            current++;
            if(current < 10)
                System.out.print(" " + current + " ");
            else
                System.out.print(current + " ");
            if(count==7 && current != days){
                count = 0;
                System.out.println();
            }
        }
        System.out.println();
    }

    public static long[] lcg (long seed){
        int m = 2147483647;
        int c = 12345;
        int a = 1103515245;
        long[] random = new long[10];

        for(int i = 0; i < random.length; i++){
            seed = (seed * a + c) % (m+1);
            random[i] = seed;
        }
        return random;
    }

    public static int randomNumberBetweenOneAndHundred(int number){
        Random random = new Random();
        number = random.nextInt(100);
        return number;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        lcg(102545);
    }
}