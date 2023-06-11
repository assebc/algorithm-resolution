import java.util.*;

class Program {

  public ArrayList<String> validIPAddresses(String string) {
    ArrayList<String> res = new ArrayList<>();
    for(int i = 1;i < Math.min(string.length(), 4);i++){
      List<String> atm = new ArrayList<>(Arrays.asList("","","",""));
      atm.set(0, string.substring(0,i));
      if(!isValid(atm.get(0))) continue;
      
      for(int j = i+1; j< i + Math.min(string.length() - i, 4); j++){
        atm.set(1, string.substring(i,j));
        if(!isValid(atm.get(1))) continue;
        
        for(int k = j + 1 ; k< j+ Math.min(string.length()-j,4);k++){
          atm.set(2, string.substring(j,k));
          atm.set(3, string.substring(k));

          if(isValid(atm.get(2)) && isValid(atm.get(3))){
            String ip = String.join(".", atm);
            res.add(ip);
          }
          
        }
      }
    }
    
    return res;
  }

  public boolean isValid(String ip){
    if(ip.length()==0) return false;
    int val = Integer.parseInt(ip);
    if(val > 255) return false;
    return ip.length() == String.valueOf(val).length();
  }
}

