package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
// this is the entity class for player statics getting some operation we are using
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="player_stats")
public class PlayerStatics {

	
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "id")
	   private long playerId;

	   @Column(name = "player")
	   private String playerName;
	   
	   @Column(name = "position")
	   private String playerPosition;
	   
	   @Column(name = "team")
	   private String playerTeam;

	   @Column(name = "age")
	   private String playerAge;

	   @Column(name = "club")
	   private String playerClub;
	  
	   @Column(name = "birth_year")
	   private String playerBirth;
      
	   @Column(name = "games")
	   private String playerGames;
	   
	   @Column(name = "games_starts")
	   private int playerStart;
	  
	   @Column(name = "minutes")
	   private String playerMinutes;
	   
	   @Column(name = "minutes_90s")
	   private int playerMinutesninty;
	   
	   @Column(name = "goals")
	   private String playerGoals;
	  
	   @Column(name = "assists")
	   private int playerAssists;
	   
	   @Column(name = "goals_pens")
	   private int playerGoalpen;
	   
	   @Column(name = "pens_made")
	   private int playerPensmade;
	   
	  
	   @Column(name = "pens_att")
	   private int playerPensAtt;
	   
	   
	   @Column(name = "cards_yellow")
	   private int playerCardyellow;
	   
	   
	   @Column(name = "cards_red")
	   private int playerCardRed;
	   
//	   @Column(name = "goals_per90")
//	   private double playerGoalsperninty;
//
//
//	   @Column(name = "assists_per90")
//	   private double playerAssistsperninty;
//
//
//	   @Column(name = "goals_assists_per90")
//	   private double playerGoalsassitsperninty;
//
//	   @Column(name = "goals_pens_per90")
//	   private double playerGoalspensperninty;
//
//	   @Column(name = "goals_assists_pens_per90")
//	   private double playerGoals_assists_pens_per90;
//
//	   @Column(name = "xg")
//	   private double playerXg;
	   
////	   @Column(name = "npxg")
////	   private double playerNpxg;
//
//	   @Column(name = "xg_assist")
//	   private double playerXgassist;
//
//	   @Column(name = "npxg_xg_assist")
//	   private double playerNpxgxgassist;
//
//	   @Column(name = "xg_per90")
//	   private double playerXgperNinty;
//
//	   @Column(name = "xg_assist_per90")
//	   private double playerXgassistperninty;
//
//	   @Column(name = "xg_xg_assist_per90")
//	   private double playerXxg_xg_assist_perninty;
//
//	   @Column(name = "npxg_per90")
//	   private double playerXnpxg_per90;
//
//	   @Column(name = "npxg_xg_assist_per90")
//	   private double playernpXg_xg_assist_per90;
	  
	   
	  
	
}
