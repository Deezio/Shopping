package FirstBuild;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate delivaryDate;
	private List<Product> products;
	private Customer customer;
	
	public Order() {}
	
	public Order(Long id, String status, List<Product> products,
			Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = LocalDate.now();
		this.delivaryDate = LocalDate.now();
		this.products = products;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDelivaryDate() {
		return delivaryDate;
	}

	public void setDelivaryDate(LocalDate delivaryDate) {
		this.delivaryDate = delivaryDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", delivaryDate=" + delivaryDate
				+ ", \nproducts=" + products + ", \ncustomer=" + customer + "]";
	}
	
	
	
}
