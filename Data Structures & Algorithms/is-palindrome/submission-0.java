class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                ans += s.charAt(i);
            }
        }
        ans = ans.toLowerCase();
        StringBuilder sb = new StringBuilder(ans).reverse();
        if(ans.equals(sb.toString())){
            return true;
        }
        return false;
    }
}
