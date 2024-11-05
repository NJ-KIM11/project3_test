package com.ohgiraffers.crewboard.controller;

import com.ohgiraffers.crewboard.dto.CrewBoardDTO;
import com.ohgiraffers.crewboard.service.CrewBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CrewBoardService crewBoardService;

    @RequestMapping(value = {"/", "/crewHome"})
    public ModelAndView defaultCrewHomeLocation(ModelAndView mv) {
        List<CrewBoardDTO> postList = crewBoardService.selectAllPosts();
        mv.addObject("postList", postList);
        mv.setViewName("crewHome");
        return mv;
    }
}
