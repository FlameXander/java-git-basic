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

    public static void saveToFile(String filename, String data) {
        try (FileOutputStream out = new FileOutputStream(filename)) {
            out.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
