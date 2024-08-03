package ConditionalStatements;

public class LargestNumber3 {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;

        if ((A >= B) && (A >= C)) {
            System.out.println("A is the largest number of 3");
        } else if (B >= C) {
            System.out.println("B is the largest number of 3");   
        } else {
            System.out.println("C is the largest number of 3");
        }
    }
}
