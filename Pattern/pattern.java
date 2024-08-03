package Pattern;

public class pattern {
    public static void main(String[] args) {
        // int n =5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Inverse

        //  //outer loop
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


            // int n=5;
            // int number=1;

            // //outer loop
            // for(int i=1; i<=n;i++){
            //     //inner loop
            //     for(int j=1; j<=i; j++){
            //         System.out.print(number);
            //         number++;   //number = number+1
            //     }
            //     System.out.println();

            // }



           int n = 5;

           //outer loop
           for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){  //even
                    System.out.print("1 ");
                }else {  //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
           }
        

    }
}
