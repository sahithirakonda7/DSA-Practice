class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j = i;j<s.length();j++)
            {
                boolean duplicates = false;

                for(int k=i;k<j;k++)
                {
                    if(s.charAt(k)==s.charAt(j))
                    {
                        duplicates = true;
                        break;
                    }
                }

                if(duplicates){
                    break;
                }
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
        
    }
}