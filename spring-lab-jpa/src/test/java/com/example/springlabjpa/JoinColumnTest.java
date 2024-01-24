package com.example.springlabjpa;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.springlabjpa.joinColumn.BasketballPlayer;
import com.example.springlabjpa.joinColumn.BasketballPlayerRepository;
import com.example.springlabjpa.joinColumn.BasketballTeam;
import com.example.springlabjpa.joinColumn.BasketballTeamRepository;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@SpringBootTest
public class JoinColumnTest {

	@Autowired
	BasketballTeamRepository teamRepository;

	@Autowired
	BasketballPlayerRepository playerRepository;

	@Test
	@Transactional
	void test() throws IllegalAccessException {
		BasketballTeam team = teamRepository.save(new BasketballTeam("최강 지상"));
		BasketballTeam team2 = teamRepository.save(new BasketballTeam("최강 한화"));
		BasketballPlayer player = playerRepository.save(new BasketballPlayer("아기상호", team));
		BasketballPlayer player2 = playerRepository.save(new BasketballPlayer("아기응애", team));

		List<BasketballPlayer> basketballPlayers = playerRepository.findAll();

		assertThat(basketballPlayers).containsExactly(player,player2);
	}

}
