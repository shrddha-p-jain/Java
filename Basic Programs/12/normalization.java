import java.util.Scanner;
class normalization{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements of array: ");
int x = s.nextInt();
float[] arr = new float[x];
System.out.print("Enter the elements of array:");
float sum=0,min=0, max=0,mean = 0;
for(int i=0;i<x;i++){
	arr[i] = s.nextFloat();
	sum+=arr[i];
	if(i==0||arr[i]<min)
		min = arr[i];
	if(i==0||arr[i]>max)
		max = arr[i];
}
mean = sum/x;
float sum_dev_sq=0;
float[] arr_mm = new float[x];
float[] arr_z = new float[x];
for(int i =0;i<x;i++){
	arr_mm[i] = (arr[i]-min)/(max-min);
	sum_dev_sq += (arr[i]-mean)*(arr[i]-mean);
}
float std = sum_dev_sq/x;
float p;
for(int i=0;i<x;i++){
	arr_z[i] = (arr[i]-mean)/std;
}
System.out.println("Array after min-max transformation: ");
for(int i=0;i<x;i++)
	System.out.print(arr_mm[i] + " ");
System.out.println();

System.out.println("Array after z-transfrmation: ");
for(int i=0;i<x;i++)
	System.out.print(arr_z[i] + " ");
System.out.println();


}
}