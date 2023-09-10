package lecture230820;
import java.util.Random;
public class Q12 {
    public static void main(String[] args) {
        int cnt=0;
        for(int i=1;i<=50;i++){
            int a = (int)(Math.random()*101);
            if(i%6!=0){
                System.out.print(a + " ");
            }
            else{
                System.out.println(a);
            }
            cnt+=a;
        }
        System.out.println(" ");
        System.out.println("합 = "+cnt);
    }
}
