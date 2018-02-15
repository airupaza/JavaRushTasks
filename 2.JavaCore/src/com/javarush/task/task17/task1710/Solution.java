package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //args = new String[5];
        //args[0] = "-i";
        //args[1] = "0";
        //args[2] = "Шорты пляжные черные в крапенку";
        //args[3] = "176.00";
        //args[4] = "15";
        String name;
        Date bd=new Date();
        int id;
        Sex sex;
        Person p;
        if (args[0].equals("-c")){
            name=args[1];
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try {bd=format.parse(args[3]);}
            catch (ParseException e) {System.out.println("Ooops!");}
            if (args[2].equals("м")) sex=Sex.MALE;
            else sex=Sex.FEMALE;
            if (sex==Sex.MALE) p=Person.createMale(name, bd);
            else p=Person.createFemale(name, bd);
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }
        else if (args[0].equals("-u")){
            id=Integer.parseInt(args[1]);
            name=args[2];
            if (args[3].equals("м")) sex=Sex.MALE;
            else sex=Sex.FEMALE;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try {bd=format.parse(args[4]);}
            catch (ParseException e) {System.out.println("Ooops!");}
            allPeople.get(id).setName(name);
            allPeople.get(id).setSex(sex);
            allPeople.get(id).setBirthDay(bd);
        }
        else if (args[0].equals("-d")){
            id=Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDay(null);
        }
        else{
            id=Integer.parseInt(args[1]);
            System.out.print(allPeople.get(id).getName()+" ");
            sex=allPeople.get(id).getSex();
            if (sex==Sex.MALE) System.out.print("м ");
            else if (sex==Sex.FEMALE) System.out.print("ж ");
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String s=allPeople.get(id).getBirthDay().toString();
            System.out.print(format.format(allPeople.get(id).getBirthDay()));

        }
    }
}
