package Array;

public class PS47 {
    public static void main(String[] args) {
        Boolean flag = false;
        int[] arr = {2, 6, 4, 1};

        // Approach 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0) {
                        flag = true;
                    }
                }
            }
        }

        //Approach 2
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0) {
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
