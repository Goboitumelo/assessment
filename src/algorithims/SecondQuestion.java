package algorithims;

public class SecondQuestion {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
       int  nums[] = {2,5,1,3,4,7};
       int n = 3 ;
       int res[]= shuffle(nums, n);
       System.out.print("[");
       for(int i=0;i<res.length-1;i++)
            System.out.print(res[i]+",");
        System.out.println( res[res.length-1] + "]");
    }
}
