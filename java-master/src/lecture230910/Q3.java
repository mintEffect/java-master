package lecture230910;

public class Q3 {
    public static void main(String[] args) {
        Song s = new Song();
        s.title = "Ditto";
        s.artist = "뉴진스";
        s.year = 2003;
        s.country = "대한민국";
        System.out.println(s.show(s.title,s.artist,s.year,s.country));
    }
}
