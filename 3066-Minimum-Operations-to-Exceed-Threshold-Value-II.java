class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue <Long>p=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            p.add((long)nums[i]);
        }
        int c=0;
        while(p.peek()<k && p.size()>1){
        long o=p.poll();
        long u=p.poll();
        long a=o*2+u;
        p.add(a);
        c++;
        }
        return c;
    }
}