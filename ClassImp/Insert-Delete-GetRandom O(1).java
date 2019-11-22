class RandomizedSet {
    HashSet<Integer> hSet;
    ArrayList<Integer> arrayList;
    Random rn;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hSet = new HashSet<Integer>();
        arrayList = new ArrayList<Integer>();
        rn = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hSet.contains(val)) return false;
        hSet.add(val);
        arrayList.add(val);
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hSet.contains(val)) return false;
        hSet.remove(val);
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        while(true){
          int randomIndex =  rn.nextInt(arrayList.size());  
          if(hSet.contains(arrayList.get(randomIndex))){
            return arrayList.get(randomIndex);    
          }
        } 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
