public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSortHelper(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSortHelper(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int mid = (i + j) / 2;
        mergeSortHelper(array, i, mid);
        mergeSortHelper(array, mid + 1, j);
        merge(array, i, mid, j);
    }

    public static void merge(int[] array, int i, int mid, int j) {
        int temp[] = new int[j - i + 1];
        int left = i;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= j) {
            if (array[left] < array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = array[left++];
        }

        while (right <= j) {
            temp[k++] = array[right++];
        }

        left = i;
        for (int m = 0; m < temp.length; m++) {
            array[left++] = temp[m];
        }
    }
}
