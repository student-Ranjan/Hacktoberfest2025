public class RotateArray {
    // rotate arr to the right by k (in-place)
    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        k = ((k % n) + n) % n; // handle k > n and negative k
        if (k == 0) return;

        // reverse whole array, reverse first k, reverse remaining n-k
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // rotate arr to the left by k (helper)
    public static void rotateLeft(int[] arr, int k) {
        rotateRight(arr, -k);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
    }
