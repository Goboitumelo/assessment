package algorithims;

import java.util.ArrayList;
import java.util.List;

public class sixethQuestion {
    public  List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        for (int i = 0; i < maxLength; i ++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i >= word.length()) {
                    sb.append(" ");
                } else {
                    sb.append(word.charAt(i));
                }
            }
            res.add(trimRight(sb.toString()));
        }
        return res;
    }

    private String trimRight(String word) {
        int pointer = word.length();
        while (--pointer > -1) {
            if (word.charAt(pointer) != ' ') {
                return word.substring(0, pointer + 1);
            }
        }
        return null;
    }

}
