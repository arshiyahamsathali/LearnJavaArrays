public class traverseArray {
    public static void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }public static void main(String[] args){
        int[] arr ={1,2,4,6,8};
        System.out.println("TraverseArray:");
        traverseArray(arr);
    }
    
}
