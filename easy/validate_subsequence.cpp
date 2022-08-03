using namespace std;

int sizes(vector<int> sequence){
  int s = 0;
  for(int x:sequence){
    s++;
  }
  return s;
}
bool isValidSubsequence(vector<int> array, vector<int> sequence) {
  int pos = 0;
  int sequence_size = sizes(sequence);
  for(int x:array){
    if(x==sequence[pos]) pos++;
    if(pos==sequence_size) return true;
  }
  
  return false;
}