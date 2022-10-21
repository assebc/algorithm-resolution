class Solution {
public:
    int romanToInt(string s) {
        int n = int(s.length());
        if (0 == n) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            switch (s[i]) {
                case 'I':
                    total += 1;
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'X':
                    total += 10;
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'C':
                    total += 100;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
            }
        }

        for (int i = 1; i < n; i++) {
            if ((s[i] == 'V' || s[i] == 'X') && s[i - 1] == 'I') total -= 2;
            if ((s[i] == 'L' || s[i] == 'C') && s[i - 1] == 'X') total -= 20;
            if ((s[i] == 'D' || s[i] == 'M') && s[i - 1] == 'C') total -= 200;
        }
        return total;
    }
};