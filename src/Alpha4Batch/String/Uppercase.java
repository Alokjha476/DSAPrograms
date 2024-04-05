package Alpha4Batch.String;

public class Uppercase {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        // for making upercase 0 index
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); // Add the string
        // Check all next charector
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i)); // add
                while (str.charAt(i) == ' ') {
                    i++;  // next index
                }
                sb.append(Character.toUpperCase(str.charAt(i))); // uppercase and add the string
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); // convert to int/float/double/etc to string type
    }

    public static void main(String[] args) {
        String str = "i am a alok    sharma";
        System.out.println(toUppercase(str));
    }
}
