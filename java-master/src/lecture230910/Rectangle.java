package lecture230910;

public class Rectangle {
    int x;
    int y;
    int w;
    int h;
    int square;
    boolean contains;
    void show(int x, int y, int w, int h){
        System.out.println("("+x+","+y+")"+"에서 크기가 "+w+"x"+h+"인 사각형");
    }
}
