import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
        	char ch1 = str1.charAt(i);
        	char ch2 = str1.charAt(i + 1);
        	
        	if (ch1 < 65 || ch1 > 90) continue;
        	if (ch2 < 65 || ch2 > 90) continue;
        	
        	list1.add(str1.substring(i, i + 2));
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
        	char ch1 = str2.charAt(i);
        	char ch2 = str2.charAt(i + 1);
        	
        	if (ch1 < 65 || ch1 > 90) continue;
        	if (ch2 < 65 || ch2 > 90) continue;
        	
        	list2.add(str2.substring(i, i + 2));
        }
        
        if (list1.size() == 0 || list2.size() == 0) {
        	if (str1.equals(str2)) return 65536;
        	else return 0;
        }
        
        if (list1.size() > list2.size()) {
        	List<String> tmp = list1;
        	list1 = list2;
        	list2 = tmp;
        }
        
        int size1 = list1.size();
        int size2 = list2.size();
        
        for (int i = 0; i < list1.size(); i++) {
        	list2.remove(list1.get(i));
        }
        
        answer = (int) ((double) (size2 - list2.size()) / (double) (size1 + list2.size()) * 65536);
        return answer;
    }
}