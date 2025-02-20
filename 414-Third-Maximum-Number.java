class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()<3){
            return Collections.max(set);
        }
        List<Integer>list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        return list.get(2);
    }
}