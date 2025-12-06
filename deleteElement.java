public class deleteElement {
    public static int[] deleteElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            result[j++] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // deleting element at index 2 (value = 30)
        int[] result = deleteElement(arr, index);
        System.out.println("Array after deletion:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
