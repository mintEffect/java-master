package lecture230820;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        sum+=a/100;
        a = a%100;
        sum+=a/10;
        sum+=a%10;
        System.out.println(sum);
    }
}
