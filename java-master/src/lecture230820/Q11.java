package lecture230820;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int year = scan.nextInt();
        if(year%400==0){
            System.out.print("윤년");
        }
        else if(year%100==0){
            System.out.print("평년");
        }
        else if (year % 4 == 0) {
            System.out.print("윤년");
        }
        else{
            System.out.print("평년");
        }
    }
}
