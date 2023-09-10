package lecture230820;
import java.util.Random;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);
        int b=0;
        System.out.println("***난수 몬스터가 나타났습니다.... 난수 몬스터의 숫자를 맞춰보세요***");
        while(2>1){
            System.out.print("난수 숫자 입력 : ");
            b = scan.nextInt();
            System.out.println(" ");
            if(b>a){
                System.out.println("난수 몬스터의 숫자가 더 작습니다.");
            }
            else if(b<a){
                System.out.println("난수 몬스터의 숫자가 더 큽니다.");
            }
            else{
                System.out.println("!!!!난수 몬스터를 잡았습니다.");
                break;
            }
        }
    }
}
