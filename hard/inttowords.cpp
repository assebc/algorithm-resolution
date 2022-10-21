static string belowTwenty[]={"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                 "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
                 "Seventeen", "Eighteen", "Nineteen"};
static string belowHundred[]={"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
static string overThousand[]={"Hundred", "Thousand", "Million", "Billion" };

class Solution {
public:
    
    string number_to_words_below_hundred(long long int num) {
        string result;

        if (num == 0) {
            return result;
        }else if (num < 20) {
            return belowTwenty[num];
        } else if (num < 100) {
            result = belowHundred [num/10];
            if (num%10 > 0) { 
                result += " " + belowTwenty[num%10];
            }
        }else {
            result = belowTwenty[num/100] + " " + overThousand[0];
            if ( num % 100 > 0 ) {
                result += " " + number_to_words_below_hundred( num % 100 );
            }
        }
        return result;
    }
    string numberToWords(int num) {
        if (num ==0 ) return belowTwenty[num];

        vector<string> ret;
        for( ;num > 0; num/=1000 ) {
            ret.push_back( number_to_words_below_hundred(num % 1000) );
        }

        string result=ret[0];
        for (int i=1; i<ret.size(); i++){
            if (ret[i].size() > 0 ){
                if ( result.size() > 0 ) {
                    result = ret[i] + " " + overThousand[i] + " " + result; 
                } else {
                    result = ret[i] + " " + overThousand[i]; 
                }
            }

        }
        return result;
    }
};