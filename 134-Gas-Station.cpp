class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int t=0;
        int s=0;
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.size();i++){
             totalgas+=gas[i];
             totalcost+=cost[i];
            

        }
        if(totalgas<totalcost){
            return -1;

        }
        else{
            for(int i=0;i<gas.size();i++){
                t+=(gas[i]-cost[i]);
                if(t<0){
                    t=0;
                    s=i+1;
                }
            }
        }
        return s;


    }
};