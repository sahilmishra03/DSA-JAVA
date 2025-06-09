package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PS06 {
    public static void main(String[] args) {
        int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<String> result = new ArrayList<>();
        maxProfit(jobs, result);
        System.out.println(result);
    }

    public static void maxProfit(int[][] jobs, ArrayList<String> arrayList) {
        int[][] newJobs = new int[jobs.length][3];
        for (int i = 0; i < jobs.length; i++) {
            newJobs[i][0] = i;
            newJobs[i][1] = jobs[i][0];
            newJobs[i][2] = jobs[i][1];
        }
        Arrays.sort(newJobs, Comparator.comparingDouble(o -> o[2]));
        int time = 0;
        for (int i = newJobs.length - 1; i >= 0; i--) {
            if (time < newJobs[i][1]) {
                arrayList.add("J" + newJobs[i][0]);
                time++;
            }
        }
    }
}
