// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :It took a lot of time inspite of knowing the solution.


// Your code here along with comments explaining your approach


class MyHashSet {
    //1000 * 1000 slots will handle the constraints
    private static final int SIZE = 1000;
    //To save all possible values in a 2d boolean matrix
    private boolean[][] storage;
    
    public MyHashSet() {
        storage = new boolean[SIZE][];
    }
    //We use hash1 to calculate row val
    private int hash1(int key){
        return key%SIZE;
    }   
    //we use hash2 to calculate col value
    private int hash2(int key){
        return key/SIZE;
    }
    public void add(int key) {
        int row = hash1(key);
        int col = hash2(key);
        if(storage[row]==null){
            if(row==0){
                storage[row] = new boolean[SIZE+1]; //TO HANDLE 0
            }
            else{
                storage[row] = new boolean[SIZE];
            }
        }
        storage[row][col] = true;
    }
    
    public void remove(int key) {
        int row = hash1(key);
        int col = hash2(key);
        if(storage[row]!=null){
            storage[row][col] = false;
        }
            
    }
    
    public boolean contains(int key) {
        int row = hash1(key);
        int col = hash2(key);
        if(storage[row]!=null){
            return storage[row][col];
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */