class Insert_anywhere_cmd{
public static void main(String[] args){
int l = Integer.parseInt(args[0]);
int a[] = new int[l+1];
for (int i=1;i<l+1;i++)
	a[i-1]=Integer.parseInt(args[i]);
int ele = Integer.parseInt(args[l+1]);
int pos = Integer.parseInt(args[l+2]);
if(pos<=l+1){
for(int i =l;i>=pos-1;i--){
if(i !=pos-1)
	a[i]=a[i-1];
else if(i==pos-1)
	a[i]=ele;
}
for(int i=0;i<l+1;i++)
	System.out.print(a[i]+" ");
}
else
System.out.print("cannot insert in position greater than length");
}
}