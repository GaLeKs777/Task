package Skills;

import interfaces.Singer;
import interfaces.Skill;

public class OperaSinger extends Artist implements Singer {

    public OperaSinger(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public Skill getSkill() {
        return this;
    }

    @Override
    public String returnSkillToString() {
        return "оперно поет";
    }
}