package com.example.personalproject.controller.totalcommunity;

import java.util.List;

import com.example.personalproject.entity.TotalCommunity;
import com.example.personalproject.service.TotalCommunityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping(value = "/mainCommunities")
@CrossOrigin(origins = "http//localhost:8080", allowedHeaders = "*")
public class TotalCommunityController {
    @Autowired
    private TotalCommunityService service;
    @GetMapping("")
    public ResponseEntity<List<TotalCommunity>> list() throws Exception{
        log.info("list()");

        return new ResponseEntity<>(service.list(),HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<TotalCommunity> register(
        @Validated @RequestBody TotalCommunity totalCommunity,
        UriComponentsBuilder uriBuilder) throws Exception{
            log.info("POST register()");

            service.register(totalCommunity);

            log.info("register totalCommunity.getBoardNo()" 
                        + totalCommunity.getBoardNo());
        return new ResponseEntity<>(totalCommunity, HttpStatus.OK);
        }
}