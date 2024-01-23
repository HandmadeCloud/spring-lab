package com.example.springlabjpa;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Team {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@OneToMany
	private Set<Player> players = new HashSet<>();

	public void add(Player player){
		player.setTeam(this);
		this.players.add(player);
	}
}
