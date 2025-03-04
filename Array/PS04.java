package Array;

public class PS04 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] arr3 = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if the element is already added to arr3
                    boolean isAlreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (arr3[k] == arr1[i]) {
                            isAlreadyAdded = true;
                            break;
                        }
                    }
                    if (!isAlreadyAdded) {
                        arr3[index] = arr1[i];
                        index++;
                    }
                    break;
                }
            }
        }
        System.out.print("Intersection: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
