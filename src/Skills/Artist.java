package Skills;

import humans.Humman;
import interfaces.Skill;

public abstract class Artist extends Humman {
    private String psevdonym;


    public Artist(String name, int age, String psevdonim) {
        super(name, age);
        this.psevdonym = psevdonim;
    }

    public abstract Skill getSkill();

    public String getPseudonym() {
        return psevdonym;
    }
}
