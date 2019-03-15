package Skills;

import interfaces.Musicant;
import interfaces.Skill;

public class Pianist extends Artist implements Musicant {

    public Pianist(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public String returnSkillToString() {
        return "играет на пианино";
    }

    @Override
    public Skill getSkill() {
        return this;
    }
}
