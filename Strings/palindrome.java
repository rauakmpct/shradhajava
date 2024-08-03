package Strings;

import ConditionalStatements.elseif;

public class palindrome {
    // public static boolean isPalindrome(String str ){
    // for(int i=0;i<str.length()/2;i++){
    // int n = str.length();
    // if(str.charAt(i) !=str.charAt(n-1-i)){
    // //not a palindrome
    // return false;
    // }
    // }
    // return true;
    // }
    // public static void main(String[] args) {
    // String str = "noon";
    // System.out.println(isPalindrome(str));
    // }

    // get shortest path

    // public static float getShortestPath(String path) {
    //     int x = 0, y = 0;

    //     for (int i = 0; i < path.length(); i++) {
    //         char dir = path.charAt(i);
    //         // South
    //         if (dir == 'S') {
    //             y--;
    //         }
    //         // North
    //         else if (dir == 'N') {
    //             y++;
    //         }
    //         // West
    //         else if (dir == 'W') {
    //             x--;
    //         }
    //         // East
    //         else {
    //             x++;
    //         }
    //     }
    //     int X2 = x*x;
    //     int Y2 = y*y;
    //     return (float)Math.sqrt(X2+Y2);
    // }

    // public static String substring(String str, int si, int ei){
    //     String substr = "";
    //     for(int i=si; i<ei;i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }


    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String newStr = "";
        //aaabc
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }


    public static void main(String[] args) {
        // String path = "EWNS";
        // System.out.println(getShortestPath(path));

        // String s1 ="Tony";
        // String s2 ="Tony";
        // String s3 = new String ("Tony");

        // if(s1==s2){
        //     System.out.println("String are eqaul");
        // } else{
        //     System.out.println("String are not equal");
        // }
        // if(s1==s3){
        //     System.out.println("String are eqaul");
        // } else {
        //     System.out.println("String are not equal");
        // }


        // if(s1.equals(s3)){
        //     System.out.println("Strings are eqaul");
        // } else {
        //     System.out.println("String are not equal");
        // }


        // Substring
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));


        //compare to
        // String fruits[]={"apple","mango","banana"};

        // String largest = fruits[0];
        // for(int i=1; i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);


        // StringBuilder

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // // System.out.println(sb.length());


        // toUpperCase

        // String str = "hi, i am shradha";
        // System.out.println(toUpperCase(str));


        //compress
        String str = "aaabbccdd";
        System.out.println(compress(str));

    }
}
