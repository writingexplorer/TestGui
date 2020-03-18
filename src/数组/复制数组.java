package 数组;

public class 复制数组 {
  public static void main(String args[]) {
	  int a[]=new int[6];
	  int b[]=new int[5];
	  int c[]=new int[11];
	  int i=0;
	  for(i=0;i<6;i++)
	  {a[i] = (int) (Math.random() * 100);System.out.println(a[i]);
	  }
	  for(i=0;i<5;i++) {  b[i] = (int) (Math.random() * 100);System.out.println(b[i]);
	  }System.out.println("分隔");
	  System.arraycopy(a,0,c,0,6);
	  System.arraycopy(b,0,c,6,5);
	  for(i=0;i<=c.length;i++)
		  System.out.println(c[i]);
  }
}
