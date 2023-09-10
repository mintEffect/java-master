package lecture230910;

import java.util.Objects;

public class Method01 {
    public static void main(String[] args) {
        Method01 instance1 = new Method01();
        int add = instance1.addNumber(1,2);
        int sub = instance1.subNumber(1,2);
        int mul = instance1.mulNumber(1,2);
        int div = instance1.divNumber(1,2);
        int cal = instance1.calculate(3,2,"+");
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(cal);
    }
    /*
     접근제어자 리턴타입 메서드명 (파라메터1, 파라메터2 ....){
        로직
     }
     */
    public int addNumber(int num,int num2){
        return num + num2;
    }
    public int subNumber(int num,int num2){
        return num - num2;
    }
    public int mulNumber(int num,int num2){
        return num * num2;
    }
    public int divNumber(int num,int num2){
        return num / num2;
    }
    public int calculate(int num, int num2, String type){
        if(Objects.equals(type, "+")){ // type == "+"
            return num + num2;
        }
        else if(Objects.equals(type, "-")){ // type == "-"
            return num - num2;
        }
        else if(Objects.equals(type, "*")){ // type == "*"
            return num * num2;
        }
        else{ // type == "/"
            return num / num2;
        }
    }
}
