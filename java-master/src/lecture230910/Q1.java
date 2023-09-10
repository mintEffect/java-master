package lecture230910;

public class Q1 {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.type = "LG";
        t1.year = 2017;
        t1.inch = 32;

        System.out.println(t1.type+"에서 만든 "+t1.year+"산 "+t1.inch+"인치 TV");

    }

}
