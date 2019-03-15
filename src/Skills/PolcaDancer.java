package Skills;

import interfaces.Dancer;
import interfaces.Skill;

public class PolcaDancer extends Artist implements Dancer {

    public PolcaDancer(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public String returnSkillToString() {
        return "танцует \"Польку\"";
    }

    @Override
    public Skill getSkill() {
        return this;
    }
}
