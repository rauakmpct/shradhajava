package Function;

public class multiply {
    public static int multiply(int a ,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int pro = multiply(a,b);
        System.out.println("a*b="+pro);
    }
}
