class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char b[]=s.toCharArray();
        int flag=1;
        for (int i=0,j=b.length-1;i<b.length&&j>i;){
          if(!(Character.isLetterOrDigit(b[i])) && !(Character.isLetterOrDigit(b[j]))){
            i++;
            j--;

          }
          else if(!Character.isLetterOrDigit(b[i])){
            i++;
          }
          else if(!Character.isLetterOrDigit(b[j])){
            j--;
          }
          else{
            if(b[i]!=b[j]){
                return false;
          }
          i++;
          j--;
          }
        }
        return true;
    }
}
