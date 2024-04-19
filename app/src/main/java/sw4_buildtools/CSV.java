package sw4_buildtools;

import java.io.FileWriter;
import java.io.IOException;

public class CSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("liste.csv")) {
            writer.append("Name,Alter,Stadt\n");
            writer.append("Anna,24,Berlin\n");
            writer.append("Bob,30,Hamburg\n");
            writer.append("Carol,22,Luzern\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
