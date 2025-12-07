public class reverseArray {
    public static void reverseArray(int[] arr){
        int l = 0, r = arr.length - 1;
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr [r];
            arr[r--] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr ={6,5,4,3,2};
        reverseArray(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    
}
