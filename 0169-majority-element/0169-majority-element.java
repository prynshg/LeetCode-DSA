class Solution {
    public int majorityElement(int[] nums) {
        int num=0;
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int i:nums){
            if(!count.containsKey(i)){
                count.put(i,1);
            }
            else
                count.put(i,count.get(i)+1);
        }
        Set<Integer> keySet = count.keySet();
        for(Integer key:keySet){
            if(count.get(key)>nums.length/2)
                num = key;
        }
        return num;
    }
    
}