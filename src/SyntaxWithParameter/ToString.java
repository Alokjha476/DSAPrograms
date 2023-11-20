package SyntaxWithParameter;

import org.w3c.dom.ls.LSOutput;

public class ToString {
    public static void main(String[] args) {
        String str = "my       name is   alok";
//        System.out.println(str);
        /*for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch == ' ' && ch2 != ' ') {
                str = str.replace(String.valueOf(ch),  String.valueOf(str.charAt(i+1)).toUpperCase());
            }
            System.out.println(str);
        }
        str = str.replace("" +str.charAt(0),  String.valueOf(str.charAt(0)).toUpperCase());*/

        String rdt = "";
        String[] strArr = str.split("\\s+");
        for (String st : strArr) {
            //System.out.println(st);
            rdt = rdt + st.trim().substring(0, 1).toUpperCase() + st.substring(1) + " ";
        }
        System.out.println(rdt);
    }


}
