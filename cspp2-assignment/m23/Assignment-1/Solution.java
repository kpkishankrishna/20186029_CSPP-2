import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
class FrequencyDictionary {
	FrequencyDictionary() {

	}
	public HashMap<String, Integer> Makedictionary(String[] string) {
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		HashSet<String> key = new HashSet<String>(Arrays.asList(string));
		int count;
		for (String i : key) {
			count = 0;
			for (String j : string) {
				if (i.equals(j)) {
					count++;
				}
				dict.put(i, count);
			}
		}
		return dict;
	}
}
class Dotproduct {
	private Dotproduct() {}
	private int dp = 0;
	public int dotproduct(HashMap<String, Integer> temp1, HashMap<String, Integer> temp2) {
		HashSet<String> key1 = new HashSet<String>(temp1.keySet());
		key1.addAll(temp2.keySet());
		for(String i : key1) {
			if (temp1.get(i) == null){
				temp1.put(i,0);
			}
			if (temp2.get(i) == null){
				temp2.put(i,0);
			}
			dp += temp1.get(i)*temp2.get(i);
		}
		return dp;

	}





}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FrequencyDictionary dict1 = new FrequencyDictionary();
		FrequencyDictionary dict2 = new FrequencyDictionary();
		String[] string1 = sc.nextLine().split(" ");
		String[] string2 = sc.nextLine().split(" ");
		HashMap<String, Integer> temp1 = dict1.Makedictionary(string1);
		HashMap<String, Integer> temp2 = dict1.Makedictionary(string2);




		
	}
}