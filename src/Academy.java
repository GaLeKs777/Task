import Skills.*;
import humans.Humman;
import inputOutput.InputTextValue;

import java.util.Random;

public class Academy {

    public Artist teach(Humman humman) {
        return upgrade(humman, new InputTextValue().getPseudonym(humman.getName()));
    }

    public Artist[] teach(Humman[] hummans) {
        Artist[] artists = new Artist[hummans.length];

        for (int i = 0; i < artists.length; i++) {
            artists[i] = teach(hummans[i]);
        }
        return artists;
    }

    public Artist upgrade(Humman humman, String pseudonym){

        switch (new Random().nextInt(6)){

            case 1:
                return new HopakDancer(humman.getAge(), humman.getName(), pseudonym);

            case 2:
                return new PolcaDancer(humman.getAge(), humman.getName(), pseudonym);

            case 3:
                return new FolkSinger(humman.getAge(), humman.getName(), pseudonym);

            case 4:
                return new GuitarPlayer(humman.getAge(), humman.getName(), pseudonym);

            case 5:
                return new OperaSinger(humman.getAge(), humman.getName(), pseudonym);

            default:
                return new Pianist(humman.getAge(), humman.getName(), pseudonym);
        }
    }
}
