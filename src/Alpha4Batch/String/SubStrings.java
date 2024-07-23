package Alpha4Batch.String;

public class SubStrings {
    public static String subStr(String str, int si, int li) {
        StringBuilder subString = new StringBuilder();
        for (int i = si; i < li; i++) {
            subString.append(str.charAt(i));

        }
        return subString.toString();
    }

    public static void main(String[] args) {
        String str = "AlokSharma";
        System.out.println(subStr(str, 0, 4));

    }
}
