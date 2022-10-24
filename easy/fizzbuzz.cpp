class Solution {
public:
    vector<string> fizzBuzz(int n) {
        int k;
        vector<string> res;
        for(int i = 0;i<n;i++){
            k = i+1;
            if(k%3==0 && k%5==0) res.push_back("FizzBuzz");
            else if(k%3==0) res.push_back("Fizz");
            else if(k%5==0) res.push_back("Buzz");
            else res.push_back(to_string(k));
        }
        return res; 
    }
};