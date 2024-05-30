class MyHashSet {
    private boolean[] HashSet;
    public MyHashSet() {
        HashSet=new boolean[10000001];
        Arrays.fill(HashSet,false);
    }
    
    public void add(int key) {
        HashSet[key]=true;
    }
    
    public void remove(int key) {
        HashSet[key]=false;
    }
    
    public boolean contains(int key) {
        return HashSet[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */