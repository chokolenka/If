import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Дано целое число. Если оно является положительным, то прибавить к нему 1;
        // в противном случае вычесть из него 2. Вывести полученное число.

        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a= in.nextInt();
        if (a>0) a++;
        else  a=a-2;
        System.out.println(a);
        in.close();
    }
}
