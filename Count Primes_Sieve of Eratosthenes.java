class Solution {
    public int countPrimes(int n) {
       
        boolean [] primes = new boolean[n];
        
        for(int i =2; i<n; i++)
        {
            primes[i] = true;
        }
        
        for(int i =2; i * i <primes.length; i++)
        {
            if(primes[i])
            {
                for(int j = i; i*j <primes.length; j++)
                {
                    primes[i*j] = false;
                }
            }
        }
        int count = 0;
        for(int i =2; i<n; i++)
        {
            if(primes[i])
                count++;
        }
        
        return count;
    }
}
