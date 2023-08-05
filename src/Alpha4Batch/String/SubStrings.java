package Alpha4Batch.String;

public class SubStrings {
    public static String subStr(String str, int si, int li) {
        String subString = "";
        for (int i = si; i < li; i++) {
            subString = subString + str.charAt(i);

        }
        return subString;
    }

    public static void main(String[] args) {
        String str = "AlokSharma";
        System.out.println(subStr(str, 0, 4));

    }
}
