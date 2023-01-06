package com.example.repo;

import com.example.entity.PlayerDefence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerDefenceRepo extends JpaRepository<PlayerDefence,Long> {
    @Query("SELECT p FROM PlayerDefence p WHERE " +
            "p.playerPosition LIKE CONCAT('%',:keyword, '%')" +
            "Or p.playTeam LIKE CONCAT('%', :keyword, '%')"+"Or p.playerTackles LIKE CONCAT('%', :keyword, '%')")
    List<PlayerDefence> search(String keyword);
}
