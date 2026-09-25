class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int streak = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curNum = num;
                int curStreak = 1;
                while(set.contains(curNum+1)){
                    curStreak+=1;
                    curNum+=1;
                }
                streak = Math.max(streak, curStreak);

            }
        }
        return streak;
        
    }
}
