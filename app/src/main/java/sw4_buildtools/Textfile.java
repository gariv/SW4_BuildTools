package sw4_buildtools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Textfile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hallo, dies ist eine einfache Textdatei.\n");
            writer.write("Diese Datei wurde mit einem Java-Programm erstellt, das durch Gradle verwaltet wird.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
