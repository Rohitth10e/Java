public class Main {

    public static int lastOcc(int arr[], int key, int i) {
        if (arr.length == i)
            return -1;
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(lastOcc(arr, 5, 0));
    }
}
