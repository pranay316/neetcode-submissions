class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1 = new String(ch1);
        String t1 = new String(ch2);
        for(int i = 0;i < s.length();i++){
            if(s1.charAt(i) != t1.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
