package dz3;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        InputAmmount record1 = new InputAmmount();
        SaveToFile save = new SaveToFile();
        InputPrompt prompt = new InputPrompt();
        boolean flag = false;
        while (flag == false) {
            CheckFields check = new CheckFields(record1.correctInput());

            Record newRecord = check.checkData();
            if (newRecord != null) {
                save.saveTxt(newRecord);
            }
        System.out.println("_________\nХотите ввести ещё одну запись?");
        flag = prompt.yesOrNo();
        }
    }
}