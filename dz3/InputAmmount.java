package dz3;
import java.io.IOException;

public class InputAmmount {
    private String sample = "";
    private int numberOfFields = 6;

    public void get() throws IOException {
        System.out.println("Введите данные в формате:\n<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");
        sample = System.console().readLine();
    }

    public int amountOfFields(){
        int counter = 0;
        int index = 0;
        index = sample.indexOf(" ", index);
        while (index != -1) {
            counter++;
            index = sample.indexOf(" ", index);
            if (index != -1) index++;
        }
        return counter;
    }

    public void info() {
        System.out.println(sample);
    }

    public int checkAmmount(){
        if (this.amountOfFields() != this.numberOfFields) return -1;
        else return 1;
    }

    public String correctInput() throws IOException {
        boolean flag = false;
        while (flag == false) {
            this.get();
            if (checkAmmount() == -1) {
            System.out.printf("_________\nКод:-1. Вы ввели неверное количество полей: %d, Введите %d полей:\n", this.amountOfFields(), numberOfFields);
            } else { 
                System.out.printf("_________\nВы ввели %d полей, выполняется проверка правильности введенных данных...\n", numberOfFields);
                flag = true;
                }
        }
        return this.sample;
    }
}

