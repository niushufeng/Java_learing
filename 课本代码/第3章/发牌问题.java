/*
编写一个模拟的java发牌程序，要求将两副牌，
也就是108张，发给4个人，并留8张底牌，最后输出底牌和每个人手中的牌
*/

import java.util.*; //调用全部
public class CardPlay 
{
	public static void main(String[] args) 
	{
		int[] total = new int[108];  //存储108张牌的数组
		int[][] player = new int[4][25]; //存储4个玩家的牌
		int leftNum = 108;  //当前剩余牌的数量
		int ranNumber;
		Random random = new Random(); //生成Random对象，用以生成随机数
		for (int i = 0;i < total.length ; i ++ ) //初始化一维数组
		{
			total[i] = (i+1)%54;
			if (total[i] == 0)  //处理大小王标号
			{
				total[i] = 54;
			}
		}
	//循环发牌

		for (int i = 0; i < 25 ;i ++ )  //为每个人发牌
		{
			for (int j = 0; j < player.length ;j ++ )  //生成随即下标
			{
				ranNumber = random.nextInt(leftNum);  //生成随机数
				player[j][i] = total[ranNumber]; //发牌
				total[ranNumber] = total[leftNum-1]; //删除已经发过的牌
				leftNum--;
			}
		}
	//循环输出玩家手中的牌
		for (int i = 0; i < player.length ; i ++ ) //通过俩层循环遍历二维数组
		{
			System.out.print("玩家" + i + "的牌：");
			for (int j =0 ;j < player[i].length ;j ++ )
			{
				System.out.print(" " + player[i][j]);
			}
			System.out.println("");
		}
	//底牌
		System.out.print("底牌：");
		for (int i = 0;i < 8 ; i ++ )
		{
			System.out.print(" " + total[i]);
		}
		System.out.println();
	}
}
