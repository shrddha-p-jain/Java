class Add_10{
static int a= 10; 		// a is static variable
int x; 				//x is instance object
int add_10(){			// instance method
	int y=x+a;		// y is local variable
	return y;
}
}

class Main{
public static void main(String args[]){
Add_10 addx=new Add_10();	
addx.x=20;			
int b = addx.add_10();
System.out.print(b+ " "+addx.x+" "+Add_10.a); 
// instance variable can only be accesed through their object.
// Static variable is accesd through the class name.


}
}