class insertElement {
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] result = new int[arr.length + 1];   // create new array with +1 size
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == index)                       // when we reach the position
                result[i] = value;                // put the new value
            else
                result[i] = arr[j++];             // otherwise copy old elements
        }
        return result;                             // return new array
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};                  // original array
        int index = 2;                             // insert position
        int value = 95;                            // new element
        int[] newArr = insertElement(arr, index, value);
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
