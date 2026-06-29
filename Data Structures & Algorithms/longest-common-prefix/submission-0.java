class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        String result = "";
        for(int i=0;i<str1.length();i++)
        {
            char res1 = str1.charAt(i);
            char res2 = str2.charAt(i);
            if(res1!=res2)
            {
                break;

            }
            else{
                result = result+res1;
            }
        

        }
        return result;
    }
}