class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if(n ==1) return true;
        int sum = 0;
        while(n != 1)
        {
            sum = 0;          
            int curr = n;
            while(curr != 0)
            {
                sum += (curr%10) * (curr%10);                 
                curr = curr/10;
            }
            
            if(sum == 1) return true;
           
            if(!set.add(sum))return false;
            n = sum;
        }
        
        return false;
    }
}
