package InputData;

import Data.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {


    public static Data readDataFromInput() {
        System.out.println("введите данные пользователя через пробел в формате Фамилия,Имя,Отчество д.м.г (дата рождения) номертелефона пол");
        try (Scanner object = new Scanner(System.in)) {


            String dataObject = object.nextLine();
            String getDataObject[] = dataObject.split(" ");
            String fio = getDataObject[0];
            boolean hasDigits = false;



            for (char ch : fio.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasDigits = true;

                }

                if (hasDigits) {
                    System.out.println("ФИО содержит цифры.");
                    readDataFromInput();
                }
            }
            String dataInput = getDataObject[1];
            String numberInput = getDataObject[2];
            String they = getDataObject[3];

            String getSurname[] = fio.split(",");
            String surname = getSurname[0];
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date date;
            int number;


            try {
                if (they.equalsIgnoreCase("F") || they.equalsIgnoreCase("M")) {

            } else {
                System.out.println("Ошибка ввода пола");
                    readDataFromInput();
            }

                number = parseInt(numberInput);
                date = format.parse(dataInput);
                format.setLenient(false);
                format.parse(dataInput);

                Calendar currentDate = Calendar.getInstance();
                Calendar inputDate = Calendar.getInstance();
                inputDate.setTime(date);
                if (inputDate.after(currentDate)) {
                    System.out.println("Введена неверная дата");
                    return readDataFromInput();
                }

            } catch (ParseException e) {
                System.out.println("Введена недействительная дата");
                return readDataFromInput();
            } catch (NumberFormatException e) {
                System.out.println("Ведены не верные номера телефона");
                return readDataFromInput();


            }
            return new Data(fio, date, number, they, surname);
        }
    }
}


