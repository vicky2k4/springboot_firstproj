package com.learn.firstproj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="Ticket")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ticket {
	@Id
	@GeneratedValue
	private int id;
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public double getAmount() { return amount; } public void setAmount(double
	 * amount) { this.amount = amount; } public String getCategory() { return
	 * category; } public void setCategory(String category) { this.category =
	 * category; }
	 */
	private double amount;
	private String category;

}
