class Solution {
    public boolean containsDuplicate(int[] nums) {
    // List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
    // Set<String> seen = new HashSet<>();
    // Set<String> duplicates = names.stream()
    //                               .filter(e -> !seen.add(e)) // add returns false if element already exists
    //                               .collect(Collectors.toSet());
    // duplicates will be ["Alice"]

    // List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    // List<Integer> distinctNumbers = numbers.stream()
    //                                        .distinct()
    //                                        .collect(Collectors.toList());
    // distinctNumbers will be [1, 2, 3, 4, 5]

        HashSet<Integer> unique = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            if(!unique.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}