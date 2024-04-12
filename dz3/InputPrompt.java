package dz3;

import java.util.Scanner;

public class InputPrompt {
    String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    Boolean yesOrNo() {
        Boolean flag = false;
        String text = "";
        while (flag == false) {
        text = prompt("Введите y/n: ");
        if (text.equalsIgnoreCase("y")|| text.equalsIgnoreCase("n")) flag = true;
        }
        if (text.equalsIgnoreCase("y")) return false;
        else return true;
    }
}
