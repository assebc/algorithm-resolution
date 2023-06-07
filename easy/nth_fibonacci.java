import java.util.*;

class Program {
  public static int getNthFib(int n) {
    // 0 1 1 2 3 5 8 13 21
    if(n>2) return getNthFib(n-1) + getNthFib(n-2);
    else if(n==2) return 1;
    else if (n==1) return 0;
    return -1;
  }
}

