package com.example.controller;


import com.example.entity.PlayerDefence;
import com.example.entity.PlayerStatics;
import com.example.service.ApplicationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fifa/api/v1/statistics")
public class ApplicationController {

    @Autowired
    private final ApplicationInterface applicationInterface;

    public ApplicationController(ApplicationInterface applicationInterface) {
        this.applicationInterface = applicationInterface;
    }

// this method is fetching all the data from playstatics table
    @GetMapping("/data")
    List<PlayerStatics>getallPlayerdata(){
        return applicationInterface.getallPlayerstats();

    }

    //this is for searching a particular id
    @GetMapping("{id}")
    public PlayerStatics getById(@PathVariable ("id") int pId)
    {
        return applicationInterface.getallById(pId);
    }

    //this based on searching like check the birth year of player give 1990 like that
    @GetMapping("/filter")
    public List<PlayerStatics>getbyfilterstats(@RequestParam("keyword") String keyword){
        return applicationInterface.findbynamestats(keyword);
    }
}


