package Pattern;

public class pattern1 {
    public static void main(String[] args) {
         
        // for(int line=1; line<=4; line++){
        //     //one line
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // inverted start patter

        // int n=4;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //Print character patter

           int n=4;
           char ch = 'A';

           //outer loop
           for(int line=1; line<=n; line++){
            //inner loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
           }
    }
}
