import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static String dogName = "Рой";
    static String catName = "Фуффи";

    static void createDog() {
        System.out.println("Создаём собаку");
    }

    static void createCat() {
        System.out.println("Создаём котика");
    }

    static void dogSpeak() {
        System.out.println("Собака: пёсик пёсик гаф-гаф-гаф");
    }

    static void catSpeak() {
        System.out.println("Котик: киси киси мяу мяу киси киси мямямяу");
    }

    static void printPetInfo() {
        System.out.println("Собака: " + dogName);
        System.out.println("Котик: " + catName);
    }

    public static void main(String[] args) {
        createDog();
        createCat();
        dogSpeak();
        catSpeak();
        printPetInfo();
    }
}