import java.util.Scanner;
class Stat{
float min,max,sum,range,mean;
Stat(float[] a){		//constructor
float x;
for(int i=0;i<10;i++){
	x = a[i];
	sum = sum+x;
	if(x<min)
		min = x;
	if(x>max)
		max = x;
}
range = max-min;
mean = sum/10;

}
}
class Statistic{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("Enter the 10 numbers:");
float arr[]=new float[10];
for(int i=0;i<10;i++)
	arr[i]=s.nextFloat();
Stat s1 = new Stat(arr);
System.out.println("Min="+s1.min+"\nMax = "+ s1.max+"\nMean = "+s1.mean+"\nRange = "+s1.range);

}
}
