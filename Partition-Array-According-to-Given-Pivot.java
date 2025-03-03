class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int c=0;
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                list.add(nums[i]);
            }
            else if(nums[i]==pivot){
                c++;
            }
        }
        for(int i=0;i<c;i++){
            list.add(pivot);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                list1.add(nums[i]);
            }
        }
        list.addAll(list1);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}