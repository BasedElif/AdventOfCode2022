import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RockPaperScissors {
    
    public static void main(String[] args) {

        try {
            File file = new File("input");
            Scanner sc1 = new Scanner(file);

            int[] answer = strategyScore(file, sc1);

            
            System.out.println(answer[0]);
            System.out.println(answer[1]);
            sc1.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        
    
    }
    
    public static int[] strategyScore(File file, Scanner sc){
        int[] finalScores = new int[2];

        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            finalScores[0] += roundScore1(data.charAt(0), data.charAt(2));
            finalScores[1] += roundScore2(data.charAt(0), data.charAt(2));
        }
        
        return finalScores;
    }
        
    

    public static int roundScore1(char other, char you) {
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

    public static int roundScore2 (char other, char result) {
        int roundScore = 0;

        if (result == 'X') {
            if (other == 'A') roundScore += 3;
            else if (other == 'B') roundScore += 1;
            else roundScore += 2;
        }
        else if (result == 'Y') {
            if (other == 'A') roundScore += 4;
            else if (other == 'B') roundScore += 5;
            else roundScore += 6;
        }
        else if (result == 'Z') {
            if (other == 'A') roundScore += 8;
            else if (other == 'B') roundScore += 9;
            else roundScore+= 7;
        }

        return roundScore;
    }

}