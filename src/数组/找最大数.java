package 数组;

public class 找最大数 {
   public static void main(String args[]) {
	   int a[]= {11,12,10,24,13};
	   int temp=0;
	  
	   for(int each:a)
	   {if(each>temp)  temp=each;
	   
	  }
	   System.out.println("最大的数"+temp);
	   
   }
}

