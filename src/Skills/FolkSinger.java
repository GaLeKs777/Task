package Skills;

import interfaces.Singer;
import interfaces.Skill;

public class FolkSinger extends Artist implements Singer {

    public FolkSinger(int age, String name, String pseudonym) {
        super(name, age, pseudonym);
    }

    @Override
    public Skill getSkill() {
        return this;
    }

    @Override
    public String returnSkillToString() {
        return "поет народные песни";
    }
}
