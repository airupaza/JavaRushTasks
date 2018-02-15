package com.javarush.task.task17.task1711;

//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //args=new String[3];
        //args[0]="-i";
        //args[1]="0";
        //args[2]="1";
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    int i=1;
                    while (i<(args.length-1)){
                        if (args[i+1].equals("м")) allPeople.add(Person.createMale(args[i], format.parse(args[i+2])));
                        else allPeople.add(Person.createFemale(args[i], format.parse(args[i+2])));
                        System.out.println(allPeople.size()-1);
                        i+=3;
                    }
                }
                break;
            case "-u":
                synchronized (allPeople){
                    int i=1;
                    while (i<args.length){
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                        if (args[i+2].equals("м"))  allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        else allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(format.parse(args[i+3]));
                        i+=4;
                    }
                }
                break;
            case  "-d":
                synchronized (allPeople){
                    for (int i=1;i<args.length;i++){
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople){
                    SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    for (int i=1;i<args.length;i++){
                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getName());
                        if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) System.out.print(" м ");
                        else System.out.print(" ж ");
                        System.out.println(f.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                    }
                }
                break;
        }

        /*if (args[0].equals("-c")){
            int i=1;
            while (i<(args.length-1)){
                if (args[i+1].equals("м")) allPeople.add(Person.createMale(args[i], format.parse(args[i+2])));
                else allPeople.add(Person.createFemale(args[i], format.parse(args[i+2])));
                System.out.println(allPeople.size()-1);
                i+=3;
            }
        }
        else if (args[0].equals("-u")){
            int i=1;
            while (i<args.length){
                allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                if (args[i+2].equals("м"))  allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                else allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[i])).setBirthDay(format.parse(args[i+3]));
                i+=4;
            }
        }
        else if (args[0].equals("-d")){
            for (int i=1;i<args.length;i++){
                allPeople.get(Integer.parseInt(args[i])).setName(null);
                allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                allPeople.get(Integer.parseInt(args[i])).setSex(null);
            }
        }
        else if (args[0].equals("-i")){
            SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            for (int i=1;i<args.length;i++){
                System.out.print();
            }
        }*/
    }
}
