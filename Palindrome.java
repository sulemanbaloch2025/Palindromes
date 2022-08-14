package palindrome;

import java.util.Scanner;

public class Palindrome{
  
  public static boolean isPalindrome(String args){
    int i =0;
    int j = args.length() -1;

    while(i < j){
      if(args.charAt(i) != args.charAt(j)){
        return false;
      }
      
      i++;
      j--;
    }

    return true;

  }

  public static void processArguments(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if(isPalindrome(args[i])){
        System.out.println(args[i]);
      }
    }
  }

}
