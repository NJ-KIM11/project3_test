package com.ohgiraffers.crewboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrewBoardController {

    @GetMapping("/writepost")
    public String writePost() {return "writePost";}



}
