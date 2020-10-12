public class MatrixMultiply 
{
	public void multiply(int[][] a,int[][]b){
	   		int [][] r = new int[4][2];		//r用于存放运算结果
		int tmp = 0;
		for (int k =0; k < r[0].length; k ++ )
		{
			// 双重循环，遍历a矩阵
			for (int i = 0;  i < a.length ; i ++)
			{
				tmp = 0;
				for (int j = 0; j < a[0].length ; j ++)
				{
					tmp += a[i][j] * b[j][k];
				}
					r[i][k] = tmp;
			}			
		}
		for (int i = 0; i < r.length ; i ++ )
		{
			for (int j = 0; j < r[0].length ; j ++ )
			{
				System.out.print(r[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[][] a = new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{11,12,13} };
		int[][] b = new int[][]{
			{1,2},
			{3,4},
			{5,6} };
		MatrixMultiply ma = new MatrixMultiply();
		ma.multiply(a,b);
	}
}
