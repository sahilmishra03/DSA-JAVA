package Array;

public class PS70 {
    public static void main(String[] args) {
        int[] batteryPercentages = { 1, 1, 2, 1, 3 };
        System.out.println(countTestedDevices(batteryPercentages));
    }

    public static int countTestedDevices(int[] batteryPercentages) {
        int count =0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i]>0) {
                count++;
                for (int j = i+1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j]=batteryPercentages[j]-1;
                }
            }
        }
        return count;
    }
}
