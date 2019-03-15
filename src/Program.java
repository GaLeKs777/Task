import Skills.Artist;
import humans.Humman;
import inputOutput.InputTextValue;

public class Program {
    public static void main(String[] args) {

        Humman[] humman = new Humman[5];
        InputTextValue inputTextValue;

        for (int i = 0; i < humman.length; i++) {
            inputTextValue = new InputTextValue();
            String name = inputTextValue.getName();
            humman[i] = new Humman(name, inputTextValue.getInt(name));
        }
        for (int i = 0; i < humman.length; i++) {
            inputTextValue = new InputTextValue();

            if(inputTextValue.changeSpecialization(humman[i].getName())){
                humman[i].setSpecialization(inputTextValue.getSpecialization());
            }
        }

        Academy academy = new Academy();
        Artist[] artists = academy.teach(humman);

        Concert concert = new Concert(artists);
        concert.presentArtists();
        concert.performShow();
    }

}
