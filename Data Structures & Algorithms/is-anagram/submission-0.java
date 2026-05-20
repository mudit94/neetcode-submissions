class Solution {
    public boolean isAnagram(String s, String t)
    {
s=s.trim();
t=t.trim();
char sb[]=s.toCharArray();;
       char st[]=t.toCharArray();
if (sb.length !=st.length)
    return false;
Arrays.sort(sb);
Arrays.sort(st);
for(int i=0;i<sb.length;i++)
{
    if(sb[i]!=st[i])
    return false;
}
    return true;
    }
}
