public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 34, 7, 23, 32, 5, 62 };
        quickSortFunc(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSortFunc(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int pivot = partition(array, i, j);
        quickSortFunc(array, i, pivot - 1);
        quickSortFunc(array, pivot + 1, j);
    }

    public static int partition(int[] array, int i, int j) {
        int pIdx = j;

        for (int k = i; k < j; k++) {
            if (array[k] < array[pIdx]) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                i++;
            }
        }

        int temp = array[i];
        array[i] = array[pIdx];
        array[pIdx] = temp;

        return i;
    }
}
