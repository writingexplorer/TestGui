package 数组;
import java.util.Arrays;
public class 二维数组排序 {
 
	public static void main(String args[]) {
	int a[][]=new int[5][8];
	int b[]=new int[40];
   for(int i=0;i<5;i++)
		{for(int j=0;j<8;j++) 
		{a[i][j]=(int) (Math.random() * 100);}}
			for(int i=0,j=0;i<5;i++,j=j+8)
				System.arraycopy(a[i], 0, b, j, 8);
	Arrays.sort(b);
	 String content = Arrays.toString(b);
     System.out.println(content);
     for(int i=0,j=0;i<5;i++,j=j+8)
			System.arraycopy(b,j,a[i],0,8);
     for(int i=0;i<5;i++)
       for(int j=0;j<8;j++)
     System.out.println(a[i][j]);
	
  }
}
