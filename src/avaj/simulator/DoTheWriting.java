package avaj.simulator;

import java.io.FileWriter;
import java.io.IOException;

public class DoTheWriting {
    private static String outFile = "simulation.txt";
    public static FileWriter fileWriter;
    
    private static void makeFileWriter() {
        try {
            fileWriter = new FileWriter(outFile, false);
        } catch (IOException e) {
            System.out.println("Cannot access output file");
        }

    }
    
    public static void writeTheThing(String string) {
        if (fileWriter == null) {
            makeFileWriter();
        }
        try {
            fileWriter.write(string);
        } catch (IOException e) {
            System.out.println("Cannot access output file");
        }
    }
}