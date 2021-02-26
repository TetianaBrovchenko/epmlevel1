package pl.epam.course.ta.level1.collections.optional;

import java.io.*;
import java.util.*;

public class FileSorted {
    public static void main(String[] args) throws IOException {
        List<String> createdListFromLine = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("BohemianRhapsody.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                createdListFromLine.add(line);
            }
        }
        Collections.sort(createdListFromLine);
        System.out.println("Файл отсортирован по строкам:");
        createdListFromLine.stream().forEach(textline -> {
            System.out.println(textline);
        });
    }
}

