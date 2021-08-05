package algorithims;

public class seventhQuestion {
    public static int minDistance(String word1, String word2) {
        int[][] d=new int[word1.length()+1][word2.length()+1];
        d[0][0]=0;
        for(int i=1;i<=word1.length();i++) d[i][0]=i;
        for(int j=1;j<=word2.length();j++) d[0][j]=j;
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) d[i][j]=d[i-1][j-1];
                else d[i][j]=Math.min(Math.min(d[i-1][j],d[i][j-1]),d[i-1][j-1])+1;

            }
            System.out.println(d[word1.length()][word2.length()]);
        }
        return d[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        minDistance("horse","ros");
    }
}
