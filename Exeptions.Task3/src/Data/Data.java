package Data;

import java.text.DateFormat;
import java.util.Date;

public class Data {



    private String fio;
    private Date date;
    private int number;
    private String they;
    private String surname;

    public Data(String fio, Date data, int number, String they, String surname) {
        this.fio = fio;
        this.date = data;
        this.number = number;
        this.they = they;
        this.surname = surname;
    }

    public String getFio() {
        return fio;
    }

    public Date getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public String getThey() {
        return they;
    }

    public String getSurname() {
        return surname;
    }
}
