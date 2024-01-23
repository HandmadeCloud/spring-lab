package com.example.springlabjpa.correlation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class Player {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@ManyToOne
	private Team team;

	public void add(){
		team.add(this);
	}
}
