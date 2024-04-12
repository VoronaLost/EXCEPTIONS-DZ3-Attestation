package dz3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAmmount {
    private String sample = "";
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //private Scanner input = new Scanner(System.in);
    private int numberOfFields = 6;
    private String[] pattern = new String[numberOfFields];


    public void get() throws IOException {
        System.out.println("Введите данные в формате:\n<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");
        //sample = input.nextLine();
        //sample = reader.readLine();
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

