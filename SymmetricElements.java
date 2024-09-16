/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.*;
public class SymmetricElements
{   
    static void printPairsOptimised(int arr[][])
	{
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i][0]; int b=arr[i][1];
			if(map.getOrDefault(b,0)==a)
				System.out.println(a+" "+ b + " & " + b + " " + map.get(b));
            else map.put(a, b);
			
		}
	}

    static void printPairsBruteForce(int arr[][])
	{
		int row=arr.length;
		for(int i=0;i<row;i++)
		{
			int a=arr[i][0]; int b=arr[i][1];
			for(int j=i+1;j<row;j++)
				if((arr[j][0]==b) && (arr[j][1]==a)){
				    System.out.println("The symmetric elements are ");
					System.out.println(a+" "+ b + " & " + arr[j][0] + " " + arr[j][1]);
					break;
				}
		}
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of array");
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
	
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			
				arr[i][j]=sc.nextInt();
			
		}
		System.out.println("Your input matrix is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			
				System.out.printf(arr[i][j]+" ");
			System.out.println();			
		}
        // printPairsBruteForce(arr);
        printPairsOptimised(arr);
        sc.close();
	}
}
