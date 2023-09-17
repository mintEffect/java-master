package LOL;

public class Start {
    public void startApp() {
        LOL champ1 = new LOL("티모", "탑", "난입", "루난의 허리케인", 1350);
        champ1.printChampInfo();
        champ1.build();
        LOL champ2 = new LOL("베인", "탑", "치명적 속도", "란두인의 예언", 3150);
        champ2.printChampInfo();
        champ2.build();
        LOL champ3 = new LOL("하이머딩거", "탑", "유성", "라바돈의 모자", 3150);
        champ3.printChampInfo();
        champ3.build();

    }
}
