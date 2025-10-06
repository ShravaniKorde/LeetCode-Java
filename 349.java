class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums1){
            set.add(x);
        }
        for(int x : nums2){
            if(set.contains(x)){
                list.add(x);
                set.remove(x);
            }
        }

        int[] res = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
