package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String reg = "Iam. Arjunan";
      Pattern pattern = Pattern.compile("..Aa.");
      Matcher matcher = pattern.matcher("12AaD");
      System.out.println(matcher.matches());	}
}
     
