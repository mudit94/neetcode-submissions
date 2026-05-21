class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
        int complement;
        for (int i=0;i<nums.length;i++)  //[3,4,5,6]
        {
            complement=target-nums[i]; // 7-3=4 //7-4=3
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i}; //[0,1]
            }
            else
            {
                hm.put(nums[i],i); //hm={3,0}
            }
        }
            return new int[]{};
            }
        }
