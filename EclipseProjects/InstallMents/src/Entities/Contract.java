package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private int number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	//CONSTRUTOR arraylist
	public List<Installment> getInstallments() {
		return installments;
	}

	// CONSTRUTOR
	public Contract() {
	}

	public Contract(int number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
	
}
