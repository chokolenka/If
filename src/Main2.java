import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Дано целое число. Если оно является положительным, то прибавить к нему 1;
        // если отрицательным, то вычесть из него2; если нулевым, то заменить его на 10.
        // Вывести полученное число.

        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a= in.nextInt();
        if (a>0) a++;
        else  a=a-2;
        System.out.println(a);
        in.close();
    }
}
