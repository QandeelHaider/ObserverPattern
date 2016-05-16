
public class Customer implements Observer {
	private int iphone;
	private static int observeridcount=0;
	private int observerid;
	private String Name;
	private Subject product;
	
	public Customer(Subject product){
		this.product= product;
		this.observerid=++observeridcount;
		System.out.println("New Observer" + observerid  );
		product.register(this);
	}
	
	@Override
	public void update(int iphone) {
		System.out.println("Iphone Available" + iphone);
		
	}

	
}
