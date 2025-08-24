import java.util.ArrayList;
import java.util.List;

class LetterCombinationOfAPhoneNo {
    private final String[] map;
    public LetterCombinationOfAPhoneNo() {
        map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    }
    public List<String> letterCombinations(String digits) {
        //your code goes here
        List<String> ans = new ArrayList<>();
        func(0, ans, digits, "");
        return ans;
    }

    public void func(int ind, List<String> ans, String digits, String current) {
        if(ind == digits.length()) {
            ans.add(current);
            return;
        }
        String currentStr = map[digits.charAt(ind) - '0'];
        for(int i = 0; i < currentStr.length(); i++) {
            func(ind+1, ans, digits, current + currentStr.charAt(i));
        }
    }
}