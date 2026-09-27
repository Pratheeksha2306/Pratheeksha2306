import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if ("aeiouAEIOU".indexOf(a[i]) == -1) {
                i++;
            } else if ("aeiouAEIOU".indexOf(a[j]) == -1) {
                j--;
            } else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(a));
    }
}
