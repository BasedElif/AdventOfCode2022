import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RucksackReorganization {

    private static final String ABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        try {
            File file = new File("input");
            Scanner sc1 = new Scanner(file);

            int answer1 = allValues(file, sc1);
    
            
            System.out.println(answer1);
            sc1.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public static int allValues(File f, Scanner sc) {
        int valueSum = 0;

        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            valueSum += getValue(inBoth(data));
        }

        return valueSum;
    }

    public static char inBoth(String s) {
        int halfLen = s.length()/2;

        for (int i = 0; i < halfLen; i++) {
            for (int j = halfLen; j < halfLen * 2; j++) {
                if (s.charAt(i) == s.charAt(j))
                    return s.charAt(i);
            }
        }
        return 'a';
    }

    public static int getValue(char c) {
        for (int i = 0; i < ABC.length();i++) {
            if (c == ABC.charAt(i))
                return i + 1;
        }
        return 1;
    }
        



        
}

