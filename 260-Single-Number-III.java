class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //List<Integer>list=new ArrayList<>();
        int []list=new int[2];
        int i=0;
        for(int num:nums){
            if(map.get(num)==1){
                list[i]=num;
                i++;
            }
        }
        return list;
    }
}