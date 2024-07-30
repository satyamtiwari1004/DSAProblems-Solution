class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 0){
            if(pq.size() == 1) return pq.poll();
            
            int y = pq.poll();
            int x = pq.poll();

            if(y != x){
                y -= x;
                pq.add(y);
            }
        }
        
        return 0;
    }
}