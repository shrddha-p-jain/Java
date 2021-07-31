import java.util.Scanner;
class Temp_Conver{
public static void main(String args[]){
double f,c;
Scanner s = new Scanner(System.in);
System.out.println("choose 1 for F to C \nchoose 2 for C to F:");
int x = s.nextInt();
switch(x){
case 1: {
System.out.println("Enter temp in F: ");
f = s.nextDouble();
c = (f-32)*5/9;
System.out.println("Temp in C: "+c);
break;
}
case 2:{
System.out.println("Enter temp in C: ");
c = s.nextDouble();
f = (c*9/5)+32;
System.out.println("Temp in F: "+f);
break;
}
default:
System.out.println("Invalid option");
}

}
}