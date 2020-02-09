package task2.hometask;

public class assorted extends NewYearGift {
	public assorted(String sname,int sqty) {
		super(sname,sqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
	}

}
