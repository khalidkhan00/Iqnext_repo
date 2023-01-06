package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
//This is the entity table for player defence
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="player_defence")
public class PlayerDefence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  long playerId;

    @Column(name = "player")
    private String playerName;

    @Column(name = "position")
    private  String playerPosition;
//
    @Column(name = "team")
    private  String playTeam;
//
    @Column(name = "age")
    private  String playerAge;
//
    @Column(name = "birth_year")
    private  int player_birth;

    @Column(name = "tackles")
    private  String  playerTackles;

    @Column(name = "tackles_won")
    private  String player_tackle_won;
//
//    @Column(name = "tackles_def_3rd")
//    private  int  player_tackles_def_3rd;
//
//    @Column(name = "tackles_mid_3rd")
//    private  int  player_tackles_mid_3rd;

//    @Column(name = "tackles_att_3rd")
//    private  int  player_tackles_att_3rd;

//    @Column(name = "dribble_tackles")
//    private  int  player_tackles_drrible_;

//    @Column(name = "dribbles_vs")
//    private  int  player_tackles_drrible_vs;

//    @Column(name = "dribble_tackles_pct")
//    private  int  player_tackles_drrible_pct;


}
