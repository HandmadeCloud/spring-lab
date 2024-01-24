package com.example.springlabjpa.joinColumn;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name="basketball_teams")
public class BasketballTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	protected BasketballTeam(){
	}

	public BasketballTeam(String name){
		this(null, name);
	}

	public BasketballTeam(Long id, String name){
		this.id = id;
		this.name = name;
	}

}
