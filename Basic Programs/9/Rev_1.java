import java.util.Scanner;
class Rev_1{
static int[] rev_arr(int[] a){ 
int temp;
int n=a.length;
for(int i=0;i<n;i++,n--){
temp = a[i];
a[i] = a[n-1];
a[n-1] = temp;
}
return a;
	
}

	

public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("Enter size of array: ");
int n = s.nextInt();
if(n<1)
	System.out.print("Invalid length of array");
else{
int m = n;
int a[] = new int[n];
System.out.print("Enter "+n+" elements:");
for(int i = 0;i<n;i++)
	a[i]=s.nextInt();
a = rev_arr(a);
System.out.println("Reverse:");
for(int i = 0;i<m;i++)
System.out.print(a[i]+ " ");
}
}
}


