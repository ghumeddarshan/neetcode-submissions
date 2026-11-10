class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        for (int p = 0; p < strs.length; p++) {
            if (strs[p].isEmpty())
                return "";
        }

        boolean b = true;
        String s = "";
        String v = "";
        int k = 0;
        int i = 0;
        int len=strs[0].length();
        int g=0;
        for(int m=1;m<strs.length;m++)
        {
            if(strs[m].length()<len){ len=strs[m].length();
            g=m;}
        }
        while (b == true && k < strs[g].length()) {
            v = s;
            s = s + strs[g].charAt(k);
            for (i = 1; i < strs.length; i++) {
                String temp = strs[i];
                if ((temp.charAt(k) != s.charAt(k))) {
                    b = false;
                    return v;
                }
            }

            k++;
        }
        return s;
    }
}