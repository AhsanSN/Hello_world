package com.itanz;
import Animal.Animal;
import Mobile.Mobile;
import Dog.Dog;
import Plane.Plane;
import Product.Product;
import com.sun.corba.se.spi.orb.Operation;
import com.sun.deploy.cache.BaseLocalApplicationProperties;
import jdk.nashorn.internal.objects.NativeMath;

import java.io.*;
import java.lang.reflect.Type;
import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static final int SIZE = 1;

    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        /**
         * Programmer Level I Exam:
         */
        // write your code here
        //section_1();
        //section_2();
        //section_3();
        //section_8();
        //section_9();

        /**
         * Programmer Level II Exam:
         */

        //section_1_lvl2();
        //section_2_lvl2();
        //section_3_lvl2();
        //section_4_lvl2();
        //section_6_lvl2();
        //section_7_lvl2();
        section_8_lvl2();

        /**
        Mobile mobile = new Mobile();
        mobile.setProductDetails("IOS213123", "IPhone 10");
        mobile.setMobileDetails("u123213", "uAPPle", "23GB", "45Pix");
        System.out.println(mobile.getName()+mobile.getCamera());

        Product product = new Product();
        System.out.println(product);
        product.SetProductDetails("123", "Sofa");
        System.out.println(product.getName());

        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter you name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
         **/
    }

    public static int hello(int myinp) {
        return (myinp+1);
    }

    public static void section_1(){
        System.out.println("Section 1");
        String myStr = "Hello World";
        System.out.println(myStr);

        // created the Product class with some functions
        Product product = new Product();
        System.out.println(product);
        product.setProductDetails("123", "Sofa");
        System.out.println(product.getName());
    }

    public static void section_2(){
        System.out.println("Section 2");

        //casting
        String myStringNumber = "1";
        Float myFloat = 0.00f;
        int myNumber = 1;
        int myNewNumber = Integer.parseInt(myStringNumber);
        if(myNewNumber==myNumber){
            System.out.println("Numbers are equal");
        }

        myFloat = (float)myNumber;
        System.out.println("My new Float: "+ myFloat);

        //Other variable types
        boolean myBool = true;
        char myChar = 'C';
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 100000;

        //inheritance
        Mobile mobile = new Mobile();
        mobile.setProductDetails("IOS213123", "IPhone 10");
        mobile.setMobileDetails("u123213", "APPle", "23GB", "45Pix");
        System.out.println(mobile.getName()+" "+mobile.getCamera());
    }

    public static void section_3() throws CloneNotSupportedException {
        System.out.println("Section 3");

        int chemMarks = 78;
        int urduMarks = 82;
        int mathMarks = 99;

        int PASSING_MARKS = 85;
        double average = (chemMarks+urduMarks+mathMarks)/3;
        System.out.println("Average: "+average);

        if (average>PASSING_MARKS){
            System.out.println("You Passed!");
        }else{
            System.out.println("You Failed!");
        }

        //superclass
        Product product = new Product();
        product.setProductDetails("123", "Sofa");
        product.clone();
        System.out.println(product.hashCode());

        //grade calculation
        if (average>=90){
            System.out.println("A Grade");
        }else if (average>=80){
            System.out.println("B Grade");
        }else if (average>=70){
            System.out.println("C Grade");
        }else if (average>=60){
            System.out.println("D Grade");
        }else{
            System.out.println("F Grade");
        }

        //using case statements
        switch ((int)average){
            case 90:
                System.out.println("You got 90");
            case 80:
                System.out.println("You got 80");
            default:
                System.out.println("You got neither 80 not 90");
        }
    }

    public static void section_8() {
        PrintWriter out = null;
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Exit block");
    }

    public static void section_9() {
        // creates empty builder, capacity 16
        StringBuilder sb = new StringBuilder();
        // adds 9 character string at beginning
        sb.append("Greetings");
        StringBuilder rev = sb.reverse();
        System.out.println(rev);

        LocalTime thisSec = LocalTime.now();

        // implementation of display code is left to the reader
        display(thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());

        int list1 = 0;
        //List<Type> list3 = new ArrayList<Type>(list1);

        testClass.FuncInter1 add = (int x, int y) -> x + y;

        testClass tobj = new testClass();
        System.out.println("Addition is " +
                tobj.operate(6, 3, add));

    }

    public static class testClass{
        interface FuncInter1
        {
            int operation(int a, int b);
        }

        private int operate(int a, int b, FuncInter1 fobj)
        {
            return fobj.operation(a, b);
        }
    }

    private static void display(int hour, int minute, int second) {
        System.out.println(hour+" "+minute+" "+second);
    }

    public static void section_1_lvl2() {
        //object + inheritance + overriding
        Mobile mobile = new Mobile();
        Plane plane = new Plane();
        mobile.setProductDetails("IOS213123", "IPhone 10");
        System.out.println(mobile.getName()+" "+mobile.getCamera());

        //Polymorphism
        mobile.move();
        plane.move();

        //singleton
        Singleton x = Singleton.getInstance();
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);

    }

    static class Singleton
    {
        // static variable single_instance of type Singleton
        private static Singleton single_instance = null;

        // variable of type String
        public String s;

        // private constructor restricted to this class itself
        private Singleton()
        {
            s = "Hello I am a string part of Singleton class";
        }

        // static method to create instance of Singleton class
        public static Singleton getInstance()
        {
            if (single_instance == null)
                single_instance = new Singleton();

            return single_instance;
        }
    }

    public static void section_2_lvl2() {

        //example of abstract classes and functions
        Animal obj = new Dog();
        obj.sound();

        //final
        final double PI = 3.141592653589793;

        //anonymous classes
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        frenchGreeting.greet();

        //used enum in product class

        //experimented with @override in Mobile class

    }

    public static void section_3_lvl2() {
        Box myBox = new Box();

        //string object
        myBox.set("hi");
        String a = (String) myBox.get();
        System.out.println("String object:"+a);

        //int object
        myBox.set(1);
        Integer b = (Integer) myBox.get();
        System.out.println("Integer object:"+b);

        //array object
        myBox.set(new int[]{1, 2, 3});
        int[] c = (int[]) myBox.get();
        System.out.println("Array object:"+c.length);
    }

    public static void section_4_lvl2() {
        //lambda expressions
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));

        //other suggested method (not lambda)
        arrL.forEach(System.out::println);

        //more lambda - add is a lambda function
        FuncInter1 add = (int x, int y) -> x + y;
        System.out.println(add);
    }

    public static void section_6_lvl2() {
        try {
            //simulating runtime err
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }   finally {
            System.out.println("finally called");
        }

        System.out.println("Exit block");
    }

    public static void section_7_lvl2() {

        DayOfWeek dotw = LocalDate.of(2012, Month.JULY, 9).getDayOfWeek();

        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed = date.with(adj);
        System.out.printf("For the date of %s, the next Wednesday is %s.%n",
                date, nextWed);

        System.out.println(date+"------"+nextWed);

        YearMonth date1 = YearMonth.now();
        System.out.printf("%s: %d%n", date1, date1.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

        MonthDay date4 = MonthDay.of(Month.JULY, 29);
        boolean validLeapYear = date4.isValidYear(2010);
        System.out.println("validLeapYear "+validLeapYear);

        boolean validLeapYear2 = Year.of(2012).isLeap();

        Instant timestamp = Instant.now();

        System.out.println("timestamp"+timestamp);
        LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());
    }

    public static void section_8_lvl2() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("inputfile.txt");
            out = new FileOutputStream("outputfile.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    interface FuncInter1
    {
        int operation(int a, int b);
    }

    public static class Box {
        private Object object;

        public void set(Object object) { this.object = object; }
        public Object get() { return object; }
    }



}
