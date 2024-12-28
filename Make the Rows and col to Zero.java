import java.util.*;
class Main{
	public static void makezeros(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;
		boolean[] zerorow = new boolean[row];
		boolean[] zerocol = new boolean[col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(matrix[i][j] == 0)
				{
					zerorow[i] = true;
					zerocol[j] = true;
				}
			}
		}
		for(int i=0;i<row;i++)
		{
			if(zerorow[i])
			{	
				Arrays.fill(matrix[i],0);
			}
		}
		for(int i=0;i<col;i++)
		{
			if(zerocol[i])
			{
				for(int j=0;j<row;j++)
				{
					matrix[j][i] = 0;
				}
			}
		}
	}
				
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row = sc.nextInt();	
		System.out.print("Enter the number of columns : ");
		int col = sc.nextInt();
		System.out.print("Enter the Elements to the matrix : ");
		int[][] matrix = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		makezeros(matrix);
		System.out.println("After making to Zeros : ");
		for(int[] u:matrix)
		{
			System.out.println(Arrays.toString(u));
		}
	}
	
}
						
