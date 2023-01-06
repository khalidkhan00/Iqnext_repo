package com.example.repo;

import com.example.entity.PlayerStatics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PlayerStatsRepo extends CrudRepository<PlayerStatics,Long> {






    @Query("SELECT p FROM PlayerStatics p WHERE " +
            "p.playerGames LIKE CONCAT('%',:keyword, '%')" +
            "Or p.playerMinutes LIKE CONCAT('%', :keyword, '%')"+"Or p.playerGoals LIKE CONCAT('%', :keyword, '%')"
            +"Or p.playerBirth LIKE CONCAT('%', :keyword, '%')")

    List<PlayerStatics> search(String keyword);
//    @Query("SELECT c from PlayerStatics c where c.playerGoals  LIKE %?1%")
//    List<PlayerStatics> search1(String keyword);



//    @Query("SELECT c from PlayerStatics c where c.playerId LIKE %?1%")
//    List<PlayerStatics> displayResult(int value);
}
