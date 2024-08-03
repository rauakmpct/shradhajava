package Loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // for(int i=1; i<= 10; i++){
        //     System.out.println("Hello Wolrd");
        // }

        // Print Square Pattern

        // for( int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }


        // Print sum of first n natural numbers , n= 5

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("sum is :" + sum);

    }
}
