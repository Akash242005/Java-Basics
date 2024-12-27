import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Coloum : ");
	int m = sc.nextInt();
	System.out.print("Enter the number of Rows : ");
	int n = sc.nextInt();
	int[][] matrix = new int[n][m];
	int top = 0;
	int bot = n-1;
	int left = 0;
	int right = m-1;
	int d = 1;
	System.out.print("Enter the Elements of "+n+" rows and "+m+" coloumn Matrix : ");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			matrix[i][j] = sc.nextInt();
		}
	}
	System.out.print("The Elements After Spirally Traversing  the "+n+" rows and "+m+" coloumn Matrix is : ");
	while(top<=bot && left<=right)
	{
		if(d==1)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.print(matrix[top][i] + " ");
			}
			top++;
		}
		else if(d==2)
		{
			for(int i=top;i<=bot;i++)
			{
				System.out.print(matrix[i][right] + " ");
			}
			right--;
		}
		else if(d==3)
		{
			for(int i=right;i>=left;i--)
			{
				System.out.print(matrix[bot][i] + " ");
			}
			bot--;
		}
		else if(d==4)
		{
			for(int i=bot;i>=top;i--)
			{
				System.out.print(matrix[i][left] + " ");
			}
			left++;
		}
		d++;
		if(d==5)
		{
			d=1;
		}
	}
	}
}
