package lecture230910;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int math = scan.nextInt();
        int science = scan.nextInt();
        int english = scan.nextInt();
        Grade me = new Grade();
        me.math = math;
        me.science = science;
        me.english = english;
        me.average = (me.math+me.science+me.english)/3;
        System.out.println("평균은 "+me.average);
    }
}
