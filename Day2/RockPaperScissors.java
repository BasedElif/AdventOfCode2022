import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RockPaperScissors {
    
    public static void main(String[] args) {

        try {
            File file = new File("input");
            Scanner sc1 = new Scanner(file);
            Scanner sc2 = new Scanner(file);

            int answer1 = strategyScore(file, sc1);
            int answer2;
            
            System.out.println(answer1);
            //System.out.println(answer2);
            sc1.close();
            sc2.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        
    
    }
    
    //part1
    public static int strategyScore(File file, Scanner sc){
        int finalScore = 0;

        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            finalScore += roundScore(data.charAt(0), data.charAt(2));
        }
        
        return finalScore;
    }
        
    

    public static int roundScore(char other, char you) {
        int roundScore = 0;

        if (you == 'X') {
            roundScore++;
            if (other == 'A') roundScore += 3;
            else if (other == 'C') roundScore += 6;
        }
        else if (you == 'Y') {
            roundScore += 2;
            if (other == 'B') roundScore += 3;
            else if (other == 'A') roundScore += 6;
        }
        else if (you == 'Z') {
            roundScore += 3;
            if (other == 'C') roundScore += 3;
            else if (other == 'B') roundScore += 6;
        }

        return roundScore;

    }


}