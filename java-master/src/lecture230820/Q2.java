package lecture230820;

public class Q2 {
    public static void main(String[] args){
        int money = 65430;
        String mon = "" + money;
        System.out.println("만원 = " + mon.charAt(0));
        System.out.println("천원 = " + mon.charAt(1));
        System.out.println("백원 = " + mon.charAt(2));
        System.out.println("십원 = " + mon.charAt(3));
    }
}
