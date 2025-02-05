class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum=arrivalTime+delayedTime;

        if(sum==24){
            sum=0;
        }
        else if(sum>24){
            sum=sum%24;
        }
        else{
            return sum;
        }
        return sum;
    }
}