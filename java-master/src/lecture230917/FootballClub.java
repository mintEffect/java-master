package lecture230917;

public class FootballClub {
    private String name;
    private String region;
    private String country;
    private int value;

    public FootballClub(String country){
        this.country = country;
    }
    public FootballClub(String country, String region, String name, int value){
        this.country = country;
        this.region = region;
        this.name = name;
        this.value = value;
    }

    public FootballClub() {

    }

    public void printClubInfo() {
        System.out.println("클럽의 국가 : " + country);
        System.out.println("클럽의 연고지 : " +  region);
        System.out.println("클럽의 이름 : " + name);
        System.out.println("클럽의 가치 : " + value);
    }

    public int calculateClubValue(int expectPercent) {
        return this.value + this.value * expectPercent;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
