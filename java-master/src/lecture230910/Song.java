package lecture230910;

public class Song {
    String title;
    String artist;
    int year;
    String country;
    String show(String title, String artist, int year, String country){
        return year+"년 "+country+" 국적의 "+artist+"가 부른 "+title;
    }
}
