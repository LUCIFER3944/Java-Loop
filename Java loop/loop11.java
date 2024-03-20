import java.util.Scanner;
public class loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a,b,c,n;
      c=0;
      a=0;
      b=1;
      System.out.println("enter number");
n=sc.nextInt();
while(n>0){
    System.out.println(a);
    c=a+b;
    a=b;
    b=c;
    n--;
}

    }
}
