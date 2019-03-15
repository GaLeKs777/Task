import Skills.Artist;

public class Concert {
    private static final String PRESENT = "Имя - %s, %d %s, Псевдоним - %s\n";
    private static final String PRESENT_TWO = "Имя - %s, %d %s, Псевдоним - %s, Специализация - %s\n";
    private static final String PERFORM = "%s %s\n";
    private Artist[] artists;

    public Concert(Artist[] artists){
        this.artists = artists;
    }

    public void presentArtists(){

        for (Artist artist : artists) {
            String age;
            if ((artist.getAge() > 5 && artist.getAge() < 20) ||
                    artist.getAge() % 10 >= 5 ||
                    artist.getAge() % 10 == 0) {
                age = "лет";
            } else if (artist.getAge() % 10 == 1) {
                age = "год";
            } else {
                age = "года";
            }
            if (artist.getSpecialization() != null) {
                System.out.printf(PRESENT_TWO, artist.getName(), artist.getAge(), age, artist.getPseudonym(), artist.getSpecialization());
            } else {
                System.out.printf(PRESENT, artist.getName(), artist.getAge(), age, artist.getPseudonym());
            }
        }
    }

    public void performShow(){
        for (Artist artist : artists) {
            System.out.printf(PERFORM, artist.getName(), artist.getSkill().returnSkillToString());
        }
    }
}
