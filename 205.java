class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] mapA = new char[256];
        Arrays.fill(mapA, (char)0);
        char[] mapB = new char[256];
        Arrays.fill(mapB, (char)0);
        for(int i = 0; i < s.length(); i++) {
            if(mapA[s.charAt(i)] == 0) {
                if(mapB[t.charAt(i)] != 0) return false;
                mapA[s.charAt(i)] = t.charAt(i);
                mapB[t.charAt(i)] = s.charAt(i);
            } else {
                if(mapA[s.charAt(i)] != t.charAt(i)) return false;
            }
        }
        return true;
    }
}



///////////////////////////////////////////////////////////////////////////////////////////////////////
Bonus Question

This can be extend to group string which are isoMorphic [Asked in Amazon ]


    public Collection<List<String>> groupIsomorphicStrings(List<String> strings) {
        if (strings == null || strings.isEmpty())
            return Collections.EMPTY_LIST;

        Map<String, List<String>> hashToList = new HashMap<>();

        for (String string : strings) {

            String hash = hash(string);

            if(!hashToList.containsKey(hash))
                hashToList.put(hash, new ArrayList<>());

            hashToList.get(hash).add(string);


        }
        return hashToList.values();
    }


    private String hash(String s) {
        if (s.isEmpty())
            return "";

        int count = 1;
        StringBuilder hash = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (map.containsKey(c))
                hash.append(map.get(c));
            else {
                map.put(c, count++);
                hash.append(map.get(c));
            }
        }
        return hash.toString();
    }

* Input: ["apple", "apply", "dog", "cog", "romi"]
 * Output: [["dog", "cog"], ["romi"], ["apple", "apply"]]