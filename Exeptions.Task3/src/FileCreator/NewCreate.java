package FileCreator;


import Data.Data;
import InputData.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;


public class NewCreate {


    public static void createFile() {

        Data data = Input.readDataFromInput();
        String surname = data.getSurname();
        String fileName = surname + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("ФИО: " + data.getFio() +" Дата: " + data.getDate() + " Номер: " + data.getNumber() + " Пол: " + data.getThey() + "\n");
            System.out.println("Данные успешно записаны в файл " + fileName);


        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }
}







