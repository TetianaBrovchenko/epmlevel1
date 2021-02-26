package pl.epam.course.ta.level1.collections.optional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseRecordedFile {
    public static void main(String[] args) throws IOException {
        List<String> createdListFromLine = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader("BohemianRhapsody1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                createdListFromLine.add(line);
            }
        }

        try (FileWriter writer = new FileWriter("BohemianRhapsody1.txt", true)) {
            writer.append(System.lineSeparator());
            String lineRecoder;
            for (int i = createdListFromLine.size() - 1; i >= 0; i--) {
                lineRecoder = createdListFromLine.get(i);
                writer.append(lineRecoder).append(System.lineSeparator());
            }
            writer.flush();
        }
    }
}
