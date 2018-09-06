package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5494143084241141762L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private Double quantity;
	private Double totalPrice;
	private Date createdDate;
	private Date updatedDate;
	@OneToOne
    private Category category;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Long id, String name, Double price, Double quantity, Double totalPrice, Date createdDate,
			Date updatedDate, Category category, Expense expense) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.category = category;
//		this.expense = expense;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", category="
				+ category + "]";
	}

//	public Expense getExpense() {
//		return expense;
//	}
//
//	public void setExpense(Expense expense) {
//		this.expense = expense;
//	}

//	@Override
//	public String toString() {
//		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPrice="
//				+ totalPrice + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", category="
//				+ category + ", expense=" + expense + "]";
//	}
	
	
	
}
