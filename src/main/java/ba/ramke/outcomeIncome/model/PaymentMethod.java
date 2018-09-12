package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethod implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7008785891706991665L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String paymentType;
	private Date dateCreated;
	private Date dateUpdated;
	@OneToOne
    @PrimaryKeyJoinColumn
    private Expense expense;
	@OneToOne
    @PrimaryKeyJoinColumn
    private PaymentIncome paymentIncome;
	
	public PaymentMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public PaymentMethod(Long id, String paymentType, Date dateCreated, Date dateUpdated, Expense expense, PaymentIncome paymentIncome) {
		this.id = id;
		this.paymentType = paymentType;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.expense = expense;
		this.paymentIncome = paymentIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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

	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}
	
	public PaymentIncome paymentIncome() {
		return paymentIncome;
	}

	public void setPaymentIncome(PaymentIncome paymentIncome) {
		this.paymentIncome = paymentIncome;
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", paymentType=" + paymentType + ", dateCreated=" + dateCreated
				+ ", dateUpdated=" + dateUpdated + ", expense=" + expense + ", paymentIncome=" + paymentIncome + "]";
	}

}
