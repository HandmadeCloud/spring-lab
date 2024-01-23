package com.example.springlabjpa.correlation;

import java.util.HashSet;
import java.util.Set;

import com.example.springlabjpa.correlation.Player;

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

	@OneToMany(mappedBy = "team")
	private Set<Player> players = new HashSet<>();

	public void add(Player player){
		player.setTeam(this);
		this.players.add(player);
	}
}
