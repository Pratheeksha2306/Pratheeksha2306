class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            String result="";
            for(int j=0;j<s.length();){
                int count=1;
                while(j+1<s.length()&&s.charAt(j)==s.charAt(j+1)){
                    count++;
                    j++;
                }
                result+=count;
                result+=s.charAt(j);
                j++;
            }
            s=result;
        }
        return s;
    }
}
