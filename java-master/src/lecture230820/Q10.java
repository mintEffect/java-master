package lecture230820;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m, kg;
        kg = scan.nextDouble();
        m = scan.nextDouble();
        double bmi = kg/(m*m);
        System.out.println("BMI : "+bmi);
        if(bmi<18.5){
            System.out.println("저체중 입니다.");
        }
        else if(bmi<25){
            System.out.println("정상 입니다.");
        }
        else if(bmi<30){
            System.out.println("과체중 입니다.");
        }
        else{
            System.out.println("비만 입니다.");
        }
    }
}
