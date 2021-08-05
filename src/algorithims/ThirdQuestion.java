package algorithims;

import java.util.HashSet;
import java.util.Set;

public class ThirdQuestion {

        public static int numJewelsInStones(String J, String S) {
            Set<Character> Jset = new HashSet<>();

            for(int j = 0; j < J.length(); j++)
                Jset.add(J.charAt(j));

            int ans = 0;

            for(int i = 0; i < S.length(); i++)
                if(Jset.contains(S.charAt(i)))
                    ans ++;
            return ans;
        }
        public static void main(String[] args) {
            String J = "aA" ;
            String S = "aAAbbbb" ;
            int res = numJewelsInStones(J, S);
            System.out.print(res);

        }


    }

