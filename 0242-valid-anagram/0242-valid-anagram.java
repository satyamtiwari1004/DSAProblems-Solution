class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }

        String s1=s.chars().sorted().mapToObj(x->String.valueOf((char) x)).collect(Collectors.joining());
        String t1=t.chars().sorted().mapToObj(x->String.valueOf((char) x)).collect(Collectors.joining());

        if(s1.equals(t1)){
            return true;
        }

        return false;

    }
}