package ConditionalStatements;

public class ifelse {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 18) {
            System.out.println("Adult : Drive,Vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not Adult");
        }
    }
}
