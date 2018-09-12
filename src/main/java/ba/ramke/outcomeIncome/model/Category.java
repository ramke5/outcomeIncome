package ba.ramke.outcomeIncome.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1901006529754780206L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date dateCreated;
	private Date dateUpdated;
	@OneToOne
    @PrimaryKeyJoinColumn
    private Item item;
	
	public Category() {
		super();
	}

	public Category(Long id, String name, Date dateCreated, Date dateUpdated, Item item) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.item = item;
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated
				+ ", item=" + item + "]";
	}	
}
