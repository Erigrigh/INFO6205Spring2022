class Solution {

    List<Integer> list = new ArrayList<>();
    Random random = new Random();
    
    public Solution(ListNode head) {
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int i = random.nextInt(list.size());
        int res = 0;
        res = list.get(i);
        return res;
    }
}
