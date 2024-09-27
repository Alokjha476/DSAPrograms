package Coding_Question;

// Write the program String1 == String 2 ==> String Anagram
public class AnagramString {

    public static boolean isAnagram(String string1 , String string2){
        Integer len1 = string1.length();
        Integer len2 = string2.length();
        return len1.equals(len2);
    }
    public static void main(String[] args) {
        String str1 = "alok";
        String str2 = "aman";
        System.out.println(isAnagram(str1,str2));
    }
}
