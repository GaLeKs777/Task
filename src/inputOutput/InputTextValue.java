package inputOutput;

import java.util.Scanner;

public class InputTextValue {
    private final String ENTER_AGE = "Введите возраст %s: ";
    private final String ENTER_NAME = "Введите имя: ";
    private final String ENTER_PSEUDONYM = "Введите псевдоним %s: ";
    private final String ENTER_SPECIALIZATION = "Введите специализацию: ";
    private final String CHANGE_SPECIALIZATION = "Есть ли специализачия у %s ('yes' or 'no'): ";

    private Scanner scanner;

    public InputTextValue() {
        scanner = new Scanner(System.in);
    }

    public String getName(){
        System.out.print(ENTER_NAME);
        return scanner.nextLine();
    }

    public String getPseudonym(String name){
        System.out.printf(ENTER_PSEUDONYM, name);
        return scanner.nextLine();
    }

    public int getInt(String name) {
        int age = -1;
        while (age < 0) {
            System.out.printf(ENTER_AGE, name);
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        }
        return age;
    }

    public String getSpecialization(){
        System.out.print(ENTER_SPECIALIZATION);
        return scanner.nextLine();
    }

    public boolean changeSpecialization(String changeName){
        String temp;
        while (true) {
            System.out.printf(CHANGE_SPECIALIZATION, changeName);
            temp = scanner.nextLine();
            if(temp.equals("yes")||temp.equals("no")){
                break;
            }
        }
        return temp.equals("yes");
    }
}