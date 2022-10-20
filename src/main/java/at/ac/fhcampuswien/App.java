package at.ac.fhcampuswien;

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

    public static int randomNumberBetweenOneAndHundred(){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        return number;
    }

    public static void guessingGame(int numbertoGuess){
        Scanner scan = new Scanner(System.in);
        int number;

        for(int i = 1; i <= 10; i++) {
            System.out.printf("Guess number " + i + ": ");
            number = scan.nextInt();
            if(i==10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            else if(number < numbertoGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            }
            else if(number > numbertoGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            else if(number==numbertoGuess){
                System.out.println("You won wisenheimer!");
                break;
            }
        }

    }

    public static boolean swapArrays(int[] firstarray, int[] secondarray){
        int[] savefirst = new int[firstarray.length];

        if(firstarray.length == secondarray.length){
            for(int i = 0; i < firstarray.length; i++){
                savefirst[i] = firstarray[i];
                firstarray[i] = secondarray[i];
                secondarray[i] = savefirst[i];
            }
            return true;
        }
        else
            return false;

    }

    public static String CamelCase(String input){
        char[] cc = input.toCharArray();
        String output;
        for(int i = 0; i < cc.length; i++){
            if(i==0){
                if((int)cc[i] >= 97 && (int)cc[i] <= 122) {
                    cc[i] = (char) ((int) cc[i] - 32);
                }
            }
            else if(((int)cc[i]<65 && (int)cc[i]>90) || ((int)cc[i]<97 && (int)cc[i]>122)){
                cc[i]=(char)32;
            }
            else{
                if((int)cc[i] >= 65 && (int)cc[i] <= 90 && (int)cc[i-1] != 32) {
                    cc[i] = (char) ((int) cc[i] + 32);
                }
                else if((int)cc[i] >= 97 && (int)cc[i] <= 122 && (int)cc[i-1] == 32) {
                    cc[i] = (char) ((int) cc[i] - 32);
                }
            }
        }
        output = String.valueOf(cc);
        System.out.println(output.replace(" ", ""));
        return output;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        CamelCase("but a noisY noise annoYs an oYster more.");
    }
}