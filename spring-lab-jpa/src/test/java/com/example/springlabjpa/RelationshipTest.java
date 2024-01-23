package com.example.springlabjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RelationshipTest {

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

		System.out.println(team.getPlayers());
		System.out.println(player.getTeam());

	}
}
