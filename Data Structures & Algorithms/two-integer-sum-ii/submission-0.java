class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int maxlen=numbers.length-1;
        while(i<maxlen&&maxlen>i){
            if(numbers[i]+numbers[maxlen]>target){
                maxlen--;
            }
            else if(numbers[i]+numbers[maxlen]<target)
                i++;
                else
                return new int[]{i+1,maxlen+1};
        }
        return new int[]{};
    }
}
