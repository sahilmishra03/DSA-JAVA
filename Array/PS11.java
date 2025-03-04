package Array;

public class PS11 {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        int[] helpingArr = new int[arr.length];
//        int index = 0;
//        for (int i = 0; i < helpingArr.length; i++) {
//            helpingArr[index] = i + 1;
//            index++;
//        }
//        for (int j = 0; j < helpingArr.length; j++) {
//            if (j >= arr.length || arr[j] != helpingArr[j]) {
//                System.out.println(helpingArr[j]);
//                break;
//            }
//        }
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum);
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
            System.out.println(actualSum);
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
