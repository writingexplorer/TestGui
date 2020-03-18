package 数组;

public class Armor extends Item{
    int acLevel;
    public static void main(String args[]) {
    	 Armor bu=new Armor();
    	 Armor shuo=new Armor();
    	bu.name="布甲";
    	bu.price=200;
    	bu.acLevel=10;
    	shuo.name="锁子甲";
    	shuo.price=100;
    	shuo.acLevel=10;
    	System.out.println(shuo.name);
    }
}
