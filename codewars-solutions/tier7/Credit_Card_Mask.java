//https://www.codewars.com/kata/5412509bd436bd33920011bc

public class Maskify {
    public static String maskify(String str) {
      String result = "";
      for(int i = 0; i < str.length(); i++)
      {
        if(str.length()-i <= 4)
          result += str.charAt(i);
        else
          result += '#';
      }
      return result;
    }
}
