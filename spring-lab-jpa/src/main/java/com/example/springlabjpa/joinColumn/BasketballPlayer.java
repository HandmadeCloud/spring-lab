package com.example.springlabjpa.joinColumn;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Table(name="basketball_players")
public class BasketballPlayer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "name")
	private BasketballTeam team;

	protected BasketballPlayer(){
	}

	public BasketballPlayer(String name, BasketballTeam team){
		this(null, name, team);
	}

	public BasketballPlayer(Long id, String name, BasketballTeam team){
		this.id = id;
		this.name = name;
		this.team = team;
	}
}
