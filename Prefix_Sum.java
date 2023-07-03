package Array;

public class Prefix_Sum {
    public static void main(String args []){
        int arr[] = {2,4,6,8,10};
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                curr = 0;
                for(int k = i; k<=j; k++) {
                    curr += arr[k];
                }
                System.out.println(curr);
                    if(max<curr){
                        max = curr;
                    }

            }
        }
        System.out.println(max);
    }
}
