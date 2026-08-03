class Solution {
    public boolean isPossible(int[] target) {
        long total = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int x : target) {
            total += x;
            pq.offer(x);
        }
        
        while (true) {
            int largest = pq.poll();
            long rest = total - largest;
            
            if (largest == 1 || rest == 1) return true; 
            if (rest == 0 || largest <= rest) return false;
            
            long prev = largest % rest;
            if (prev == 0) return false;
            
            pq.offer((int)prev);
            total = rest + prev;
        }
    }
}