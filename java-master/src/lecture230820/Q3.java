package lecture230820;

public class Q3 {
    public static void main(String [] args){
        int money = 1500000;
        int m = 55000;
        int tax = money/10;
        int f = money+m-tax;
        System.out.println("실수령액 : " + f);
    }
}
