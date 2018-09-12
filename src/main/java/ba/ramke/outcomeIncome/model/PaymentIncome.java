package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "payment_income")
public class PaymentIncome implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8446671491857378648L;
	@Id
	@GeneratedValue
	private Long id;
	private Double amount;
	private String note;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date date;
	private Date dateCreated;
	private Date dateUpdated;
	@OneToOne
    private PaymentMethod paymentMethod;
	
	public PaymentIncome() {
		// TODO Auto-generated constructor stub
	}

	public PaymentIncome(Long id, Double amount, String note, Date date, Date dateCreated, Date dateUpdated,
			PaymentMethod paymentMethod) {
		super();
		this.id = id;
		this.amount = amount;
		this.note = note;
		this.date = date;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.paymentMethod = paymentMethod;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	@Override
	public String toString() {
		return "PaymentIncome [id=" + id + ", amount=" + amount + ", note=" + note + ", date=" + date + ", dateCreated="
				+ dateCreated + ", dateUpdated=" + dateUpdated + ", paymentMethod=" + paymentMethod + "]";
	}


	
}
