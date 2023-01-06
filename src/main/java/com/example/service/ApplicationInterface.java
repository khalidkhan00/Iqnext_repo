package com.example.service;

import com.example.entity.PlayerDefence;
import com.example.entity.PlayerStatics;

import java.util.List;
import java.util.Optional;

public interface ApplicationInterface {

    List<PlayerStatics> getallPlayerstats();




    PlayerStatics getallById(long pId);

    List<PlayerDefence> getallPlayerdefence();

    PlayerDefence getallByIdefence(long pId);


    List<PlayerDefence> findbyname(String keyword);


    List<PlayerStatics> findbynamestats(String keyword);
}
