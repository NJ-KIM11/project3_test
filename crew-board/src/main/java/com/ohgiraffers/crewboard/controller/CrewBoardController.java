package com.ohgiraffers.crewboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrewBoardController {

    @GetMapping("/writepost")
    public String writePost() {return "writePost";}

    @PostMapping("/postwritten")
    public ModelAndView postWritten(ModelAndView mv, @RequestParam(name = "content")Object content) {
        mv.addObject("content", content);
        mv.setViewName("postList");
        return mv;
    }
//    @PostMapping("/tempimg")
//    public ModelAndView tempImg(ModelAndView mv) {
//
//    }



}
