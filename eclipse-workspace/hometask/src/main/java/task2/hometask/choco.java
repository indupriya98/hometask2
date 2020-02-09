package task2.hometask;

public class choco extends NewYearGift {
	public choco(String cname,int cqty) {
		super(cname,cqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
	}

}
