class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i = 0;i < strs.length;i++){
            if(visited[i]) continue;
            List<String> s1 = new ArrayList<>();
            s1.add(strs[i]);
            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);
            for(int j = i+1;j < strs.length;j++){
                char[] ch2 = strs[j].toCharArray();
                Arrays.sort(ch2);
                if(new String(ch1).equals(new String(ch2))){
                    s1.add(strs[j]);
                    visited[j] = true;
                }
            }
            groups.add(s1);
            s1 = null;
        }
        return groups;
    }
}
