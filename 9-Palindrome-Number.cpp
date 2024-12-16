class Solution {
public:
    bool isPalindrome(int x) {
        while(x<0){
            return false;
        }
        int rem=0;
        long long dig;
        long long temp=x;
        while(temp!=0){
        
        rem=temp%10;
         dig=dig*10+rem;
        temp/=10;
        }
        if(dig==x){
        return true;
        }
        else{
            return false;
        }
    }
};