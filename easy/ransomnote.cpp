class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
	    if(ransomNote == "") return true;
	    if(magazine == "") return false;
	    unordered_map<char, int> m;
	    for(char c:magazine){
		    m[c]++;
	    }
	    for(char c:ransomNote){
		    if(m.find(c) == m.end()) return false;
		    if(m[c] == 0) return false;
		    m[c]--;
	    }
	    return true;
    }
};