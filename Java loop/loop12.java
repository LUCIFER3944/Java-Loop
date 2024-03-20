import java.util.Scanner;

public class loop12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a,b,c,d,n;
a=0;
b=1;
c=2;
d=0;

System.out.println("enter number");

n=sc.nextInt();
while(n>0){
    System.out.println(a);
    d=a+b+c;
    a=b;
b=c;
c=d;
n--;
}

        }
    }

