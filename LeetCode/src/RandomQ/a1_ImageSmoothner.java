package RandomQ;

//	Input: img = [[100,200,100],[200,50,200],[100,200,100]]
//	Output: [[137,141,137],[141,138,141],[137,141,137]]
//	Explanation:
//	For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
//	For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
//	For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138

public class a1_ImageSmoothner 
{
	public static int[][] Smoothner(int[][] arr)
	{
		if(arr[0].length<3 || arr.length<3)
		{
			return arr;
		}
		else
		{
			int[][] xyz = new int[3][3];
			int sum1=0;
			int sum2=0;
			int sum3=0;
			for(int i=0 ; i<3 ; i++)
			{
				for(int j=0 ; j<3 ; j++)
				{
					if((i+j)%2==0 || i!=1 && j!=1)
					{
						sum1 += arr[i][j];
						
					}
					else if (i!=1 && j!=1)
					{
						sum2+=arr[i][j];
						
					}
					else
					{
						sum3+=xyz[i][j];
					}
				}
				
			}
			sum1 =(int) Math.floor(sum1/4);
			sum2 = (int)Math.floor(sum2/6);
			sum3 = (int)Math.floor(sum3/9);
			System.out.println(sum2);
			
			for(int i=0 ; i<3 ; i++)
			{
					for(int j=0 ; j<3 ; j++)
					{
						if((i+j)%2==0 || i!=1 && j!=1)
						{
							xyz[i][j]=sum1;
							
						}
						else if (i!=1 && j!=1)
						{
							xyz[i][j]=sum2;
							
						}
						else
						{
							xyz[i][j]=sum3;
						}
					}
			}
			return xyz;
		}
	}
	public static void main(String[] args) 
	{
		int[][] xyz = {{100,200,100},{200,50,200},{100,200,100}};
		xyz = Smoothner(xyz);
		for(int i=0 ; i<xyz.length ; i++)
		{
			for(int j=0 ; j<xyz.length ; j++)
			{
				System.out.println(xyz[i][j]);
			}
		}
	}
}
