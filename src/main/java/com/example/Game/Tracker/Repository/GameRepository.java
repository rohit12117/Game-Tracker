package com.example.Game.Tracker.Repository;

import com.example.Game.Tracker.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
