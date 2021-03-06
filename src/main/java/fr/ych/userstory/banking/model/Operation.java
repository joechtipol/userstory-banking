package fr.ych.userstory.banking.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class Operation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -711103143738574223L;


	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(sequenceName = "operation_seq", allocationSize = 1, name = "OPERATION_SEQ")
    private int id;

	
    @Column(name = "type_operation")
    private String typeOperation;
	

	@Column
    private double amount;
    
    @Column(name = "date_operation")
    private LocalDate operationDate;
    
    
    public LocalDate getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(LocalDate operationDate) {
		this.operationDate = operationDate;
	}
	
	
	@ManyToOne
    @JoinColumn(name="id_account")
    private Account account;
    
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}


}
