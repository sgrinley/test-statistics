package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

//      Step 1: Create an array of 10 test score
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91};

//      Step 2: Variables for calculations
        int sum = 0;
        int highScore = scores[0];
        int lowScore = scores[0];

//      Step 3: Loop through array
        for (int score : scores) {
            sum += score;

            if (score > highScore) {
                highScore = score;
            }
            if (score < lowScore) {
                lowScore = score;
            }
        }
//      Step 4: Calculate average
        double average = (double) sum / scores.length;
        Arrays.sort(scores);

//      Step 5: Calculate median
        double median;
        int middle = scores.length / 2;
        median = (scores[middle - 1] + scores[middle]) / 2.0;

//      Step 6: Display results
        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Median: " + median);
    }
}



