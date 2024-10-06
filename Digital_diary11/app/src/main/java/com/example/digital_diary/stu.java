package com.example.digital_diary;

import java.io.Serializable;

public class stu implements Serializable {
    private String Name;
    private String Number;
    private String Position;
    private String Mail;

   public stu()
   {

   }
    public stu(String name, String number, String position, String mail) {
        Name = name;
        Number = number;
        Position = position;
        Mail = mail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getMail() {return Mail;}

    public void setMail(String mail) { Mail = mail;}
}
