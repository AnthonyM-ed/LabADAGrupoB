public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int sup = arr.length - 1;
        int x = 4;
        int rpta = binarySearch(arr, 0, sup, x);

        if (rpta != -1) {
            System.out.println("Encontrado en la posición " + rpta);
        } else {
            System.out.println("No encontrado...");
        }
    }

    public static int binarySearch(int arr[], int inf, int sup, int x) {
        if (sup >= inf) {
            int mid = inf + sup / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, inf, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, sup, x);
        }
        return -1;
    }
}