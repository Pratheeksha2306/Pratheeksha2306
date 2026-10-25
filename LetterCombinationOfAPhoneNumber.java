class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[]letters={
            "" ,"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            result.add("");
            for(int i=0;i<digits.length();i++){
                String current=letters[digits.charAt(i)-'0'];
                List<String>temp=new ArrayList<>();
                for(String combination:result){
                    for(int j=0;j<current.length();j++){
                        temp.add(combination+current.charAt(j));
                    }
                }
                result=temp;
            }
            return result;
        }
    }
