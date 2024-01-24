package com.example.springlabjpa.joinColumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketballPlayerRepository extends JpaRepository<BasketballPlayer,Long> {

}
