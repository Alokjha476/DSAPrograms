package Alpha4Batch.String;

class A {
    public static String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};  // 0,1,2

    void display(int a) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[a]) {
                System.out.println(arr[i]);
            }
        }
    }

    void display(int a, int b) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == arr[b]) {
                System.out.print(arr[i] + " ");
            } else if (arr[i] == arr[a]) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    void display(String str) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == str) {
                System.out.println(i);
            }

        }
    }

    void display(String a, String b, String c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.print(i + " ");
            }
            if (arr[i] == b) {
                System.out.print(i + " ");
            }
            if (arr[i] == c) {
                System.out.print(i);
            }
        }
    }

}


public class DeprontoQuestionString extends A {
    public static void main(String[] args) {
        DeprontoQuestionString m = new DeprontoQuestionString();
        m.display(4);
        m.display(2, 4);
        m.display("four");
        m.display("one", "two", "three");

    }
}

