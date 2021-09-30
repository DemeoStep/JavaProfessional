package homework3.task2;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer;

        writeFile("src/homework3/task2/src.txt", null);
        stringBuffer = readFile("src/homework3/task2/src.txt");

        System.out.println("  src: " + stringBuffer);

        for (int i = 0; i < stringBuffer.length(); i++) {
            stringBuffer.setCharAt(i, (char) (stringBuffer.charAt(i) + 5));
        }

        writeFile("src/homework3/task2/coded.txt", stringBuffer);

        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(readFile("src/homework3/task2/coded.txt"));
        System.out.println("coded: " + stringBuffer);

    }

    private static void writeFile(String fileName, StringBuffer stringBuffer) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {

            if (stringBuffer != null) {
                writer.write(stringBuffer.toString());
            } else {
                for (int i = 0; i < 10; i++) {
                    writer.write((char) new Random().nextInt(90 - 65) + 65);
                }
            }

            writer.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static StringBuffer readFile(String fileName) {
        StringBuffer strBuffer = new StringBuffer();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {

            int c;
            while ((c = reader.read()) != -1) {
                strBuffer.append((char) c);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return strBuffer;
    }
}
