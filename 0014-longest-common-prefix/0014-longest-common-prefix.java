class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int maxLength=0;
        for(int i=0; i<s1.length() & i<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                maxLength++;
            }else if(i==0){
                return "";
            }else{
                break;
            }
        }
        return s1.substring(0,maxLength);
    }
}