class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    int a[]=new int[26];
    int b[]=new int[26];
    for(int i=0;i<s.length();i++)
    {
        char k=s.charAt(i);
        int g=(int)k;
        a[g-97]++;
    }
    for(int j=0;j<t.length();j++)
    {
        char k=t.charAt(j);
        int g=(int)k;
        b[g-97]++;
    }
    for(int i=0;i<26;i++)
    {
        if(a[i]!=b[i]) return false;
    }
    return true;
    }
}
