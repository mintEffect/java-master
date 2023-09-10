package lecture230820;

import javax.swing.text.Style;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("밑변 : " );
        int l = scan.nextInt();
        System.out.print("높이 : " );
        int h = scan.nextInt();
        float w = l*h/2;
        System.out.print("넓이 : " + w +0);
    }
}
