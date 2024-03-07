import java.io.*;
import java.util.*;

public class Freq {
    
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
        Map<String, Integer> m = new HashMap<String, Integer>();

        int lines = linesAmount();

        String[] words = new String[lines];
        for(String a : words){
            String lineWord;
            if((lineWord = reader.readLine()) != null){
                a = lineWord;
            }
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);

        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);

        reader.close();
    }

    static int linesAmount() throws IOException{
        final BufferedReader reader = new BufferedReader(new FileReader("words.txt"));

        int lines = 0;

        String line;
        while((line = reader.readLine()) != null){
            lines++;
        }
        reader.close();
        return lines;
    }
}