import java.util.Scanner;
import static java.lang.System.*;

class Main 
{
  public static void main(String[] args) 
  {
        
    Scanner scan = new Scanner(in);
    out.println("Type the message to be shortened");
    String str = scan.nextLine();
    str = str.toLowerCase();
    String vowels = "aeiou";
    String newStr = str.substring(0, 1);
    int repeats = 0;
    int vr = 0;
    
    for (int i = 1; i < str.length(); i++){
      if (vowels.contains(str.substring(i, i+1))){
        vr++;
      }
      if (str.substring(i-1, i).equals(str.substring(i, i+1)) && !vowels.contains(str.substring(i, i+1))){
        repeats++;
      }
      else if(vowels.contains(str.substring(i, i+1)) && str.substring(i-1, i).equals(" ")){
        newStr += str.substring(i, i+1);
        vr--;
      }
      else if (!vowels.contains(str.substring(i, i+1))){
        newStr += str.substring(i, i+1);
      }
    }
    out.println("\nAlgorithm 1");
    out.println("Vowels removed: " + vr);
    out.println("Repeats removed: " + repeats);
    out.println("Algorithm 1 message: " + newStr);
    out.println("Algorithm 1 characters saved: " + (str.length() - newStr.length()));
    
    String newStr2 = "";
    int u = 0;
    for (int i = 0; i < str.length(); i++){
      int c = 0;
      for (int j = 0; j < str.length(); j++){
        if (!newStr2.contains(str.substring(i, i+1))){
          if (str.substring(i, i+1).equals(str.substring(j, j+1))){
            c++;
          }
        }
      }
      if (!newStr2.contains(str.substring(i, i+1)) && !str.substring(i, i+1).equals(" ")){
        newStr2 += c + str.substring(i, i+1);
        u++;
      }
    }
    out.println("\nAlgorithm 2");
    out.println("Unique characters found: " + u);
    out.println("Algorithm 2 message: " + newStr2);
    out.println("Algorithm 2 characters saved: " + (str.length() - newStr2.length()));
    
  }
}
