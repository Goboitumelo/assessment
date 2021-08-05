package algorithims;

public class FifthQuestion {
    private static int findMaxConsecutiveOnes(int[] a, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numConversions = 0;
        int left = 0, right = 0;

        for(right = 0; right < a.length; right++) {
            if(a[right] == 0) {
                numConversions++;
            }

            while(numConversions > k) {
                if(a[left] == 0) {
                    numConversions--;
                }
                left++;
            }

            maxOnes = Math.max(maxOnes, right-left+1);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int result = findMaxConsecutiveOnes(a, k);
        System.out.printf("length of the longest (contiguous) subarray that contains only 1s = " + result);
    }

}
