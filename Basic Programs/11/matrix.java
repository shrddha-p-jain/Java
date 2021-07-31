import java.util.Scanner;
class matrix{

static int[][] make_matrix(int m, int n){
	int mat[][] = new int[m][n];
	System.out.println("Enter the elements of array rowwise: ");
	Scanner s = new Scanner(System.in);
	for(int i = 0;i <m;i++){
		for(int j=0;j<n;j++){
			mat[i][j]=s.nextInt();
		}
	}
	return mat;
}

static void print_matrix(int[][] A,int m, int n){
	for(int i = 0;i <m;i++){
		for(int j=0;j<n;j++){
			System.out.print(A[i][j]+" ");
		}
		System.out.println();
	}
}

static int[][] add(int[][] A, int[][] B,int m,int n){
	int C[][] = new int[m][n];
	for(int i =0;i<m;i++){
		for(int j=0;j<n;j++)
			C[i][j]=A[i][j]+B[i][j];
	}
	return C;
}

static int[][] sub(int[][] A, int[][] B,int m,int n){
	int C[][] = new int[m][n];
	for(int i =0;i<m;i++)
		for(int j=0;j<n;j++)
			C[i][j]=A[i][j]-B[i][j];
	return C;
}

static int[][] t(int[][] A,int m,int n){
	int C[][] = new int[n][m];
	for(int i =0;i<m;i++)
		for(int j=0;j<n;j++)
			C[j][i]=A[i][j];
	return C;
}



static int[][] mult(int[][] A, int[][] B,int m,int n, int q){
	int C[][] = new int[m][q];
	for (int i = 0; i < m; i++) { 
        	for (int j = 0; j < q; j++) { 
                	for (int k = 0; k < n; k++) 
                    		C[i][j] += A[i][k] * B[k][j]; 
            	} 
        } 
	return C;
}


public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int x;
	do{
	System.out.println("Select the operation: \n 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Transpose \n 5 - Exit");
	x=s.nextInt();
	switch(x){
	case 1:{
		System.out.print("Enter the number of rows of first matrix: ");
		int m =s.nextInt();
		System.out.print("Enter the number of col of first matrix: ");
		int n =s.nextInt();
		System.out.print("Enter the number of row of second matrix: ");
		int p =s.nextInt();
		System.out.print("Enter the number of col of second matrix: ");
		int q =s.nextInt();
		if(m<1||n<1||p<1||q<1){
			System.out.print("Matrix dimensions must be positive");
			break;
		}
		if(m!=p||n!=q){
			System.out.print("Cannot perform operation on matrix of different dimension array");
			break;
		}
		int[][] A= new int[m][n];
		int[][] B= new int[m][n];
		int[][] C = new int[m][n];
		A = make_matrix(m,n);
		B = make_matrix(m,n);
		C = add(A,B,m,n);
		System.out.println("Matrix 1:");
		print_matrix(A,m,n);
		System.out.println("Matrix 2:");
		print_matrix(B,m,n);
		System.out.println("Sum:");
		print_matrix(C,m,n);
		break;
	}
	case 2:{
		System.out.print("Enter the number of row of first matrix: ");
		int m =s.nextInt();
		System.out.print("Enter the number of col of first matrix: ");
		int n =s.nextInt();
		System.out.print("Enter the number of row of second matrix: ");
		int p =s.nextInt();
		System.out.print("Enter the number of col of second matrix: ");
		int q =s.nextInt();
		if(m<1||n<1||p<1||q<1){
			System.out.print("Matrix dimensions must be positive");
			break;
		}
		if(m!=p||n!=q){
			System.out.print("Cannot perform operation on matrix of different dimension array");
			break;
		}
		int[][] A= new int[m][n];
		int[][] B= new int[m][n];
		int[][] C = new int[m][n];
		A = make_matrix(m,n);
		B = make_matrix(m,n);
		C = sub(A,B,m,n);

		System.out.println("Matrix 1:");
		print_matrix(A,m,n);
		System.out.println("Matrix 2:");
		print_matrix(B,m,n);
		System.out.println("Subtract:");
		print_matrix(C,m,n);
		break;
	}
	case 3:{
		System.out.print("Enter the number of row of first matrix: ");
		int m =s.nextInt();
		System.out.print("Enter the number of col of first matrix: ");
		int n =s.nextInt();
		System.out.print("Enter the number of row of second matrix: ");
		int p =s.nextInt();
		System.out.print("Enter the number of col of second matrix: ");
		int q =s.nextInt();
		if(m<1||n<1||p<1||q<1){
			System.out.print("Matrix dimensions must be positive");
			break;
		}
		if(n!=p){
			System.out.print("Cannot perform operation on matrixes of these dimension array");
			break;
		}
		int[][] A= new int[m][n];
		int[][] B= new int[p][q];
		int[][] C = new int[m][q];
		A = make_matrix(m,n);
		B = make_matrix(p,q);
		C = mult(A,B,m,n,q);
		
		System.out.println("Matrix 1:");
		print_matrix(A,m,n);
		System.out.println("Matrix 2:");
		print_matrix(B,p,q);
		System.out.println("Product:");
		print_matrix(C,m,q);
		break;
	}
	case 4:{
		System.out.print("Enter the number of row of matrix: ");
		int m =s.nextInt();
		System.out.print("Enter the number of col of matrix:");
		int n =s.nextInt();
		if(m<1||n<1){
			System.out.print("Matrix dimensions must be positive");
			break;
		}
		int[][] A= new int[m][n];
		int[][] C = new int[n][m];
		A = make_matrix(m,n);
		C = t(A,m,n);
		
		System.out.println("Matrix 1:");
		print_matrix(A,m,n);
		System.out.println("Transpose:");
		print_matrix(C,n,m);
		break;
	}
	case 5: break;
	default: System.out.println("Enter a valid option. Press 5 to exit.");
	
	}
} while(x!=5);
}

}