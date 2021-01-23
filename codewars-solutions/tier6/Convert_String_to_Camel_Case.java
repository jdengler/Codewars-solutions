//https://www.codewars.com/kata/517abf86da9663f1d2000003

import java.lang.*;
class Solution {
  static String toCamelCase(String s) {
    String result = "";
    for(int x = 0; x < s.length(); x++) {
      if(s.charAt(x) == '-' || s.charAt(x) == '_')
        result += Character.toUpperCase(s.charAt(1+(x++)));
      else
        result += s.charAt(x);
    }
    return result;
  }
}
