package Loops;

public class dowhileloop {
    public static void main(String[] args) {
        // int counter = 1;
        // do{
        //     System.out.println("Hello World");
        //     counter++;
        // } while(counter <= 10);


        // Print reverse of a number, n=10899

        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n/10;
        }
        // System.out.println();
    }
}
