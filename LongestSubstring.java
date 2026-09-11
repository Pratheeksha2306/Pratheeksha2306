class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        String temp="";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            while(temp.indexOf(ch)!=-1){
                temp=temp.substring(1);
            }

    
                temp+=ch;
                if(temp.length()>max){
                    max=temp.length();
                }
            }
        
        return max;
    }
}
