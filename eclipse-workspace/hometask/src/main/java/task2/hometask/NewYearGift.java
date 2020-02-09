package task2.hometask;

/**
 * Hello world!
 *
 */

public abstract class NewYearGift
{
    private String giftname;
    private int giftqty;
    public NewYearGift(String name,int qty) {
    	giftname=name;
    	giftqty=qty;
    }
    public void setGName(String x) {
    	giftname=x;
    }
    public String getGName() {
    	return giftname;
    }
    public void setGQty(int y) {
    	giftqty=y;
    }
    public int getGQty() {
    	return giftqty;
    }
    abstract void wrap(); 	

}
                                                                                                             