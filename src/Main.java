import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 2, 6, 7, 8, 9};
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
        int low = array.length - 5;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int [] arr, int low, int high)
    {
        if (arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low)/2;
        int opora = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] > opora) {
                i++;
            }
            while (arr[j] < opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }}