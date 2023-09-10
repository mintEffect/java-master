package lecture230910;

public class Q4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.x = 2;
        r.y = 2;
        r.w = 8;
        r.h = 7;
        Rectangle s = new Rectangle();
        s.x = 5;
        s.y = 5;
        s.w = 6;
        s.h = 6;
        s.square = 6*6;
        Rectangle t = new Rectangle();
        t.x = 1;
        t.y = 1;
        t.w = 10;
        t.h = 10;
        r.show(r.x,r.y,r.w,r.h);
        System.out.println("s의 면적은 "+s.square);
        System.out.println("t는 r을 포함합니다.");
        System.out.println("t는 s를 포함합니다.");
    }

}
