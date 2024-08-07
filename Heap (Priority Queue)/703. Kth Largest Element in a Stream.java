class KthLargest {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        // for(var n: nums)
        // add(n);
        // simple for-loop.
        for (int i = 0; i < nums.length; i++) 
        add(nums[i]); 
    }
    
    public int add(int val) {

         pq.offer(val);
        if(pq.size() > k)
        pq.poll();
        return pq.peek();    
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */