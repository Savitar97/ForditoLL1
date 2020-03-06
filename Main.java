import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInp = new Scanner(System.in);
        System.out.println("Enter the input");
        String inStr = myInp.nextLine();
        LL elemzo=new LL(inStr);
        System.out.println(elemzo.calculat());
    }
}
/*
* S->ABC
* A->a|Bbc|Ccd
* B->bBb|cCc
* C->dDd|Dd
* D->e
*
* acedcded
* */