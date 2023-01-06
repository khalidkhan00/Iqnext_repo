package com.example.service.impl;

import com.example.entity.PlayerDefence;
import com.example.repo.PlayerDefenceRepo;
import com.example.repo.PlayerStatsRepo;
import com.example.entity.PlayerStatics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.ApplicationInterface;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationImpl implements ApplicationInterface {

    @Autowired
    private PlayerStatsRepo playerStatsRepo;
    @Autowired
    private PlayerDefenceRepo playerDefenceRepo;

    public ApplicationImpl(PlayerStatsRepo playerStatsRepo,PlayerDefenceRepo playerDefenceRepo) {
        this.playerStatsRepo = playerStatsRepo;
        this.playerDefenceRepo=playerDefenceRepo;
    }

    @Override
    public List<PlayerStatics> getallPlayerstats() {
        return (List<PlayerStatics>) playerStatsRepo.findAll();

    }
    @Override
    public PlayerStatics getallById(long pId) {
        Optional<PlayerStatics>id=playerStatsRepo.findById(pId);
        if(id.isPresent()) {
            return id.get();
        }
        else {
            return null;
        }
    }
    @Override
    public List<PlayerDefence> getallPlayerdefence() {
        return (List<PlayerDefence>) playerDefenceRepo.findAll();
    }

    @Override
    public PlayerDefence getallByIdefence(long pId) {
        Optional<PlayerDefence>id=playerDefenceRepo.findById(pId);
        if(id.isPresent()) {
            return id.get();
        }
        else {
            return null;
        }
    }

    @Override
    public List<PlayerDefence> findbyname(String keyword) {
        List<PlayerDefence> playerDefences = playerDefenceRepo.search(keyword);
        return playerDefences;
    }

    @Override
    public List<PlayerStatics> findbynamestats(String keyword) {
        List<PlayerStatics> playerStatics = playerStatsRepo.search(keyword);
        return playerStatics;
    }


//    @Override
//    public PlayerStatics getallByfilter(long pId) {
//        Optional<PlayerStatics>id=playerStatsRepo.findById(pId);
//        if(id.isPresent()) {
//            return id.get();
//        }
//        else {
//            return null;
//        }
//    }



}
