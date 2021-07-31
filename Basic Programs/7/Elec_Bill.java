import java.util.Scanner;
class Calc_Bill{
double pay;
Calc_Bill(long units){
	if (units<=100)
		pay = units*1.20;
	else if(units<=300)
		pay = 100*1.20+(units-100)*2;
	else if(units>300)
		pay = 100*1.20+200*2+(units-300)*3;

	
	
}
}

class Elec_Bill{
public static void main(String args[]){
long unit;
Scanner s = new Scanner(System.in);
System.out.println("Enter units:");
unit = s.nextLong();
if(unit<0){
System.out.print("Invalid Entry");
}
else{
Calc_Bill calc = new Calc_Bill(unit);
System.out.print(calc.pay);
}
}
}


