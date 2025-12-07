public class rotateArray {
    public static int[] rotateArray(int[] arr, int k){
        int d = arr.length;
        k = k%d;
        int[] res = new int[d];
        for(int i = 0; i<d; i++){
            res[i] = arr[(i+k)%d];
        }return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k= 2;
        rotateArray(arr, k);
        for(int i :arr){
            System.out.println(i+ " ");
        }
    }
    
}
