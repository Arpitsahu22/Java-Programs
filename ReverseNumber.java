import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumsReverse(n);
        System.out.println();
        printNums(n);
    }
    static void printNums(int n){
        if(n<0){
            return;
        }
        printNums(n-1);
        System.out.print(n+" ");

    }
    static void printNumsReverse(int  n){
        if(n<0){
            return;
        }
        System.out.print(n+" ");
        printNumsReverse(n-1);

    }
}
