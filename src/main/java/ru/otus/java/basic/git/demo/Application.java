package ru.otus.java.basic.git.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    public static void doSomething() {
        System.out.println("---");
        System.out.println("- -");
        System.out.println("- -");
        System.out.println("---");
    }

    public static void saveToFile() {
        try (FileOutputStream out = new FileOutputStream("1.txt")) {
            out.write("Hello World".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
