class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxi=0;
        for(List<Integer>l:wall){
            int sum=0;
            for(int i=0;i<l.size()-1;i++){
                sum+=l.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);
                maxi=Math.max(maxi,map.get(sum));
            }
        }
        return wall.size()-maxi;
    }
}