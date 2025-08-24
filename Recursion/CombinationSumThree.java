class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        func(k , n, 1, list, ans);
        return ans;
    }

    public void func(int totalEl, int sum, int currentNum, List<Integer> list, List<List<Integer>> ans) {
        if(list.size() == totalEl && sum == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if( sum < 0 || list.size() > totalEl) return;

        int element = list.isEmpty() ? 1 : list.get(list.size() -1) + 1;
        for(int i = element; i <= 9; i++) {
            if(i <=sum) {
                list.add(i);
                func(totalEl, sum - i, currentNum + 1, list, ans);
                list.remove(list.size() - 1); 
            }
            else {
                break;
            }
        }
 
    }
}