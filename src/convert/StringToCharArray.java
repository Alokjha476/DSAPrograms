package convert;

public class StringToCharArray {
    public static void convert(String str){
        char [] ch = new char[str.length()];
        for (int i = 0; i < ch.length ; i++) {
            ch[i] = str.charAt(i);

        }
        for (char ch1 : ch){
            System.out.print(ch1 + " ");
        }
        
    }
    
    
    public static void main(String[] args) {
        String str = "AlokKumar";
        convert(str);
        
    }
}
