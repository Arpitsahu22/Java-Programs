
public class Middle {
    public static void main(String[] args) {
       int []arr={1,2,3,4,5,6,7,8,9,10};
       int n= arr.length;

        if (n % 2 == 0) {
            System.out.print(arr[n / 2 - 1]);
            System.out.println(arr[n/2]);
        } else {
            System.out.println(arr[n / 2]);
        }
    }
}
