package lecture230917;

public class Start {
    public void startApp() {
        FootballClub clubA = new FootballClub();
        clubA.setName("Real Madrid");
        clubA.setCountry("Spain");
        clubA.setRegion("Madrid");
        clubA.setValue(10);
        clubA.printClubInfo();
        int clubALater1YearValue = clubA.calculateClubValue(100);
        System.out.println("clubA의 내년 가치는 " + clubALater1YearValue);
        FootballClub clubB = new FootballClub("UK");
        clubB.setName("Liverpool FC");
        clubB.setRegion("Liverpool");
        clubB.setValue(9);
        clubB.printClubInfo();
        int clubBLater1YearValue = clubB.calculateClubValue(90);
        System.out.println("clubB의 내년 가치는 : " + clubBLater1YearValue);

        FootballClub clubC = new FootballClub("Italy","Milan","AC Milan",9);
        clubC.printClubInfo();
        int clubCLater1YearValue = clubC.calculateClubValue(100);
        System.out.println("clubC의 내년 가치는 : " + clubCLater1YearValue);
    }
}
