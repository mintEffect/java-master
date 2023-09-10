package lecture230820;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name :" );
        String name = scan.nextLine();
        System.out.println(" ");
        System.out.print("kor : ");
        int kor = scan.nextInt();
        System.out.println(" ");
        System.out.print("eng : ");
        int eng = scan.nextInt();
        System.out.println(" ");
        System.out.print("mat : ");
        int math = scan.nextInt();
        System.out.println(" ");
        int sum = kor + eng + math;
        float av = sum/3;
        System.out.println("이름 : "+ name);
        System.out.println("합계점수 : "+ sum);
        System.out.println("평균점수 : "+ av);

    }
}
