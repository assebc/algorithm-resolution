class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        unordered_map<int,int> res;
        for(int i = 0;i<accounts.size();i++){
            for(int j = 0;j<accounts[i].size();j++){
                res[i] += accounts[i][j];
            }
        }
        int w = 0, i = 0;
        while(i<accounts.size()){
            if(res[i]>w) w = res[i];
            i++;
        }
        return w;
    }
};