package homework4.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/homework4/task2/src.txt";
        StringBuffer stringBuffer = readFile(fileName);

        Pattern pattern = Pattern.compile(
                "(\\sза\\s)|(\\sко\\s)|(\\sв\\s)|(\\sиз\\s)|(\\sна\\s)|(\\sу\\s)|(\\sс\\s)|(\\sот\\s)|(\\sпод\\s)|" +
                        "(\\sо\\s)|(\\sпередо\\s)|(\\sдо\\s)|(\\sпо\\s)|(\\sк\\s)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher m = pattern.matcher(stringBuffer);

        stringBuffer.replace(0, stringBuffer.length(), m.replaceAll(" Java "));

        System.out.println(stringBuffer);
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
