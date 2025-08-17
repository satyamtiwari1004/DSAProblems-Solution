class Solution {
    public boolean isAnagram(String s, String t) {

// 	• Same index → fuse into one loop.
// 	• Different indices → separate into two loops.
// 	• Same array + same index → best case for fusion.
//    Different arrays + different indices → best case for separation.
        // if(s.length() !=t.length()){
        //     return false;
        // }

        // String s1=s.chars().sorted().mapToObj(x->String.valueOf((char) x)).collect(Collectors.joining());
        // String t1=t.chars().sorted().mapToObj(x->String.valueOf((char) x)).collect(Collectors.joining());

        // if(s1.equals(t1)){
        //     return true;
        // } //beats 9%

        // HashMap<Character,Integer> map = new HashMap<>();
        // if(s.length()==t.length()){
        //     for(int i=0;i<s.length();i++){
        //         if(map.containsKey(s.charAt(i))){
        //             map.put(s.charAt(i),map.get(s.charAt(i))+1);
        //         }else{
        //             map.put(s.charAt(i),1);
        //         }
        //         if(map.containsKey(t.charAt(i))){
        //             map.put(t.charAt(i),map.get(t.charAt(i))-1);
        //         }else{
        //             map.put(t.charAt(i),-1);
        //         }
        //     }
        //     return !map.values().stream().anyMatch(x -> x!=0);
        // } //beats 6%

        // if(s.length()==t.length()){
        //     int[] charSet = new int[26];
        //     for(int i=0;i<s.length();i++){
        //         charSet[s.charAt(i)-'a']++;
        //         charSet[t.charAt(i)-'a']--;
        //     }
        //     for(int val : charSet) { if(val!=0) return false;}
        //     return true;
        // }

        //  return false; //beats 42.35%
        if(s.length()!=t.length()){return false;}
            int[] charSet = new int[26];
            for(int i=0;i<s.length();i++){
                charSet[s.charAt(i)-'a']++;
            }
            for(int i=0;i<t.length();i++){
                charSet[t.charAt(i)-'a']--;
            }

            for(int val : charSet) { if(val!=0) return false;}
            return true;
        
    }
}