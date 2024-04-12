package dz3;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public void saveTxt(Record record) {
        try {
            FileWriter writer = new FileWriter(record.getFamily() + ".txt", true);
         
            writer.write(record.toString() + "\n");
            writer.close();
         
         } catch (IOException e) {
            System.out.println("Возникла ошибка при записи");
         }
        
    }
}
