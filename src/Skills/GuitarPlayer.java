package Skills;

import interfaces.Musicant;
import interfaces.Skill;

public class GuitarPlayer extends Artist implements Musicant {

    public GuitarPlayer(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public Skill getSkill() {
        return this;
    }

    @Override
    public String returnSkillToString() {
        return "играет на гитаре";
    }
}
