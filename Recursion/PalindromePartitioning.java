import java.util.ArrayList;
import java.util.List;

class PalindromPartitioning {
    public List<List<String>> partition(String s) {
        //your code goes here
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        func(0, list, ans, s);
        return ans;
    }
    public void func(int ind, List<String> list, List<List<String>> ans, String s) {
        if(ind == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = ind; j < s.length(); j++) {
            if(isPalindrome(s,ind, j)) {
                String substring = s.substring(ind, j +1);
                list.add(substring);
                func(j+1, list, ans, s);
                list.remove(list.size() -1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}