package LOL;

public class LOL {
    private String name;
    private String lane;
    private String rune;
    private String core;
    private int price;

    public LOL(String name, String lane, String rune, String core, int price){
        this.name = name;
        this.lane = lane;
        this.rune = rune;
        this.core = core;
        this.price = price;
    }
    public void printChampInfo(){
        System.out.println("챔피언 이름 : " + name);
        System.out.println("챔피언 주 라인 : " + lane);
    }
    public void build(){
        System.out.println("룬 : " + rune);
        System.out.println("아이템 코어 : " + core);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRune() {
        return rune;
    }

    public void setRune(String rune) {
        this.rune = rune;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
