class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            mp.computeIfAbsent(sortedStr,x-> new ArrayList()).add(str);
            
            // if (mp.containsKey(sortedStr)) {
            //     mp.get(sortedStr).add(str);
            // } else {
            //     mp.put(sortedStr,new ArrayList<String>(Arrays.asList(str)));
            // }
        }
        return new ArrayList<>(mp.values());
    }
}