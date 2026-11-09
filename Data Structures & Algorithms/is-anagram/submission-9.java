class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    int a[]=new int[26];
    int b[]=new int[26];
    char k='1'; int g=0;
    for(int i=0;i<s.length();i++)
    {
         k=s.charAt(i);
         g=(int)k;
        a[g-97]++;
    }
    for(int j=0;j<t.length();j++)
    {
         k=t.charAt(j);
         g=(int)k;
        b[g-97]++;
    }
    for(int i=0;i<26;i++)
    {
        if(a[i]!=b[i]) return false;
    }
    return true;
    }
}
