import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CalorieCounting {
    public static void main(String[] args) {

        try {
            File file = new File("input.txt");
            Scanner sc1 = new Scanner(file);
            Scanner sc2 = new Scanner(file);

            int answer1 = maxElfFood(file, sc1);
            int answer2 = topThreeCalories(file,sc2);
            
            System.out.println(answer1);
            System.out.println(answer2);
            sc1.close();
            sc2.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        
    
    }
    //part 1
    public static int maxElfFood(File file, Scanner sc) {
        int maxCalories = 0;
        int currentElfCalories = 0;

        while (sc.hasNextLine()) {
            String data = sc.nextLine();

            if (data != "") {
                int calories = Integer.parseInt(data);
                currentElfCalories += calories;
            }
            else {
                if (currentElfCalories > maxCalories)
                    maxCalories = currentElfCalories;

                currentElfCalories = 0;
            }
        }
        return maxCalories;
    }

    //part 2
    public static int topThreeCalories(File file, Scanner sc) {
        int currentElfCalories = 0;
        int[] topThree = new int[3];

        while (sc.hasNextLine()) {
            String data = sc.nextLine();

            if (data != "") {
                int calories = Integer.parseInt(data);
                currentElfCalories += calories;
            }
            
            else {
                if (currentElfCalories > topThree[arrayMinIndex(topThree)]) {
                    topThree[arrayMinIndex(topThree)] = currentElfCalories;
                }
                

                currentElfCalories = 0;
            }
            
        }


        return arraySum(topThree);
    }

    public static int arraySum(int[] a) {
        int sum = 0;

        for(int j = 0; j < a.length; j++) {
            sum += a[j];
        }

        return sum;
    }
    
    public static int arrayMinIndex(int[] a) {
        int min = a[0];
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
}