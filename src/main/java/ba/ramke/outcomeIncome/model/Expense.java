package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "expenses")
public class Expense implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5853767798486037693L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date date;
	private Double totalPrice;
	private Date dateCreated;
	private Date dateUpdated;
	@OneToOne
    private PaymentMethod paymentMethod;
	@OneToOne
    private Place place;
	@OneToMany
	private List<Item> items;
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}

	public Expense(Long id, Date date, Double totalPrice, Date dateCreated, Date dateUpdated, PaymentMethod paymentMethod, Place place, List<Item> items) {
		super();
		this.id = id;
		this.date = date;
		this.totalPrice = totalPrice;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.paymentMethod = paymentMethod;
		this.place = place;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", date=" + date + ", totalPrice=" + totalPrice + ", dateCreated=" + dateCreated
				+ ", dateUpdated=" + dateUpdated + ", paymentMethod=" + paymentMethod + ", place=" + place + ", items="
				+ items + "]";
	}

}