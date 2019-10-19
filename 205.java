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