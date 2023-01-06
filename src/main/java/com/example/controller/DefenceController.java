package com.example.controller;

import com.example.entity.PlayerDefence;
import com.example.service.ApplicationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fifa/api/v1/defense")
public class DefenceController {

    @Autowired
    private final ApplicationInterface applicationInterface;


    public DefenceController(ApplicationInterface applicationInterface) {
        this.applicationInterface = applicationInterface;
    }

    //in this fetching all the data from the player defence table
    @GetMapping("/getalldetails")
    List<PlayerDefence> getallPlayerdefence(){
        return applicationInterface.getallPlayerdefence();
}


//getting the particular player id
    @GetMapping("{idd}")
    public PlayerDefence getByIddefence(@PathVariable("idd") long pId)
   {
        return applicationInterface.getallByIdefence(pId);
    }

    //to check the player position judt give MF U can check no of player who are on MF
    @GetMapping("/filter")
    public List<PlayerDefence>getbyfilter(@RequestParam("keyword") String keyword){
        return applicationInterface.findbyname(keyword);
    }
}
