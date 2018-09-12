package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4064608326975576049L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String placeName;
	private Date dateCreated;
	private Date dateUpdated;
	@OneToOne
    @PrimaryKeyJoinColumn
    private Expense expense;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}
	
	public Place(Long id, String placeName, Date dateCreated, Date dateUpdated, Expense expense) {
		this.id = id;
		this.placeName = placeName;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.expense = expense;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
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

	@Override
	public String toString() {
		return "Place [id=" + id + ", placeName=" + placeName + ", dateCreated=" + dateCreated + ", dateUpdated="
				+ dateUpdated + ", expense=" + expense + "]";
	}

}
