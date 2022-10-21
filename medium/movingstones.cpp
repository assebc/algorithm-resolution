class Solution {
public:
    vector<int> numMovesStones(int a, int b, int c) {
        vector<int> v = {a, b, c};
        int least, most;
        sort(v.begin(), v.end());
        
        most = (v[1]-v[0]-1) + (v[2]-v[1]-1);
        if(most == 0){
            least = 0;
        }else{
            least = min(v[1]-v[0]-1, v[2]-v[1]-1);
            least = (least <= 1) ? 1 : 2;
        }
        
        return {least, most};
    }
};