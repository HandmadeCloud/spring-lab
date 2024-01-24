package com.example.springlabjpa;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springlabjpa.correlation.Player;
import com.example.springlabjpa.correlation.PlayerRepository;
import com.example.springlabjpa.correlation.Team;
import com.example.springlabjpa.correlation.TeamRepository;

@SpringBootTest
public class CorrelationTest {

	@Autowired
	TeamRepository teamRepository;

	@Autowired
	PlayerRepository playerRepository;

	@Test
	public void contextLoads(){
		Team team = new Team();
		team.setName("빨강 팀");
		teamRepository.save(team);

		Player player = new Player();
		player.setName("김민수");

		team.add(player);

		playerRepository.save(player);
		assertThat(team.getPlayers()).isNotNull();
	}
}
