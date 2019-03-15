package Skills;

import interfaces.Dancer;
import interfaces.Skill;

public class HopakDancer extends Artist implements Dancer {
    public HopakDancer(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public Skill getSkill() {
        return this;
    }

    @Override
    public String returnSkillToString() {
        return "танцует \"Гопак\"";
    }
}
