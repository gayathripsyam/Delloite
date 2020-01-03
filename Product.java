import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable,Comparable<Product>{
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuantity;
	
	public int compareTo(Product o) {
		if(this.getproductQuantity() > o.getproductQuantity())
		return 0;
		else
			return -1;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity= productQuantity;
	}

	public int getproductId() {
		return productId;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductNamee(String productName) {
		this.productName = productName;
	}

	public int getproductPrice() {
		return productPrice;
	}

	public void productPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getproductQuantity() {
		return productQuantity;
	}

	public void setproductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	
	
	public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id : "); productId = scanner.nextInt();
        System.out.println("Enter product name : "); productName = scanner.next();
        System.out.println("Enter product price : "); productPrice = scanner.nextInt();
        System.out.println("Enter product quantity : ");productQuantity= scanner.nextInt();
    }
	
	
	public void Updateproduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required product id : "); productId = scanner.nextInt();
        System.out.println("Enter new product name : "); productName = scanner.next();
        System.out.println("Enter new product price : "); productPrice = scanner.nextInt();
        System.out.println("Enter new product quantity : ");productQuantity= scanner.nextInt();
    }
	
	

	@Override
	public String toString() {
		return "\n Product [productId=" + productId+ ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQuantity=" + productQuantity + "]";
	}

	
}
