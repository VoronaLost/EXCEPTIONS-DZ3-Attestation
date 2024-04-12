package dz3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckFields {
    private static String [] sample;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);

    public CheckFields(String data){
        sample = new String[6];
        sample = data.split(" ");  
    }

    public Record checkData() {
        int num = 0;
        char s = ' ';
        try {
          Date date = formatter.parse(sample[3]);
          String check = formatter.format(date);
          if (!check.equals(sample[3]) || sample[3].length() != 10) throw new ParseException(null, num); 
          //System.out.println(sample[3] + " Вот такую дату вы ввели, она правильная");
        } catch (ParseException e) {
            System.out.println("_________\nНеверный формат даты, вы ввели: " + sample[3] + ", введите данные в формате: dd.mm.yyyy" );
            sample[3] = null;
        }
        try {
            num = Integer.parseInt(sample[4]);
        } catch (Exception e) {
            System.out.println("_________\nНеверный номер телефона, вы ввели: " + sample[4] + ", введите целое число" );
            sample[4] = null;
        }
        try {
            s = sample[5].toCharArray()[0];
            //System.out.println(sample[5].toCharArray()[0]);
            if (s != 'f' && s != 'm') throw new Exception();
            if (sample[5].toCharArray().length != 1) throw new Exception();
        } catch (Exception e) {
            System.out.println("_________\nНеверный формат пола, вы ввели: " + sample[5] + ", введите в поле символ m или f" );
            sample[5] = null;
        }

        if (sample[3] != null && sample[4] != null && sample[5] != null) {
            System.out.println("_________\nВы ввели корректные данные для текущей записи");
            return new Record(sample[0], sample[1], sample[2], sample[3], num, s);
        } else return null;

    }
    
}
