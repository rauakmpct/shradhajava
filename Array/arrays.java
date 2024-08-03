package Array;

import java.util.Scanner;

public class arrays {
    // public static void main(String[] args) {

    // int marks[] = new int[100];

    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt(); // phy
    // marks[1] = sc.nextInt(); // chem
    // marks[2] = sc.nextInt(); // match

    // System.out.println("phy:" + marks[0]);
    // System.out.println("chem:" + marks[1]);
    // System.out.println("math:" + marks[2]);

    // int percentage = (marks[0]+marks[1]+marks[2])/3;
    // System.out.println("percentage=" +percentage+"%") ;

    // }

    // find largest number

    // public static int getLargest(int numbers[]){
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;

    // for(int i=0;i<numbers.length;i++){
    // if(largest<numbers[i]){
    // largest = numbers[i];
    // }
    // if(smallest>numbers[i]){
    // smallest = numbers[i];
    // }
    // }
    // System.out.println("mallest value is :"+ smallest );
    // return largest;
    // }
    // public static void main(String[] args) {
    // int numbers[]={1,2,6,3,5};
    // System.out.println("largest value is :" + getLargest(numbers));
    // }

    // Binary Search

    // public static int binarySearch(int numbers[],int key){
    // int start =0, end=numbers.length-1;

    // while(start<=end){
    // int mid = (start+end)/2;

    // //comparisons
    // if(numbers[mid]==key){ //found
    // return mid;
    // }
    // if(numbers[mid]<key){ //right
    // start=mid+1;
    // }
    // else{//left
    // end=mid-1;
    // }
    // }
    // return-1;
    // }
    // public static void main(String[] args) {
    // int numbers[]={2,4,6,8,10,12,14};
    // int key=14;

    // System.out.println("index for key is:"+ binarySearch(numbers, key));
    // }

    // reverse

    // public static void reverse(int numbers[]){
    // int first =0,last=numbers.length-1;

    // while(first<last){
    // //swap
    // int temp=numbers[last];
    // numbers[last]=numbers[first];
    // numbers[first]=temp;

    // first++;
    // last--;
    // }
    // }
    // public static void main(String[] args) {
    // int numbers[]={2,4,6,8,10};

    // reverse(numbers);
    // for(int i=0;i<numbers.length;i++){
    // System.out.print(numbers[i]+" ");
    // }
    // System.out.println();
    // }

    // pairs in array

    // public static void printPairs(int numbers[]){
    // for(int i=0;i<numbers.length;i++){
    // int curr = numbers[i];
    // for(int j=i+1;j<numbers.length;j++){
    // System.out.print("("+ curr +","+numbers[j]+")");
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String[] args) {
    // int numbers[]={2,4,6,8,10};
    // printPairs(numbers);
    // }

    // array subpairs

    // public static void printSubarrays(int numbers[]){
    // for(int i=0;i<numbers.length;i++){
    // int start=i;
    // for(int j=i; j<numbers.length;j++) {
    // int end = j;
    // for(int k=start;k<=end;k++){//print
    // System.out.print(numbers[k]+""); //subarrays
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    // int numbers[]={2,4,6,8,10};
    // printSubarrays(numbers);
    // }

    // sell and buy

    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]) {  //profit
                int profit=prices[i]-buyPrice; //todaysprofit
                maxProfit=Math.max(maxProfit,profit);  
            }else{
                buyPrice=prices[i];
            }
        }
    return maxProfit;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }

}
