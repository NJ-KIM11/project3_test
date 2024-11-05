package com.ohgiraffers.crewboard.service;

import com.ohgiraffers.crewboard.dto.CrewBoardDTO;
import com.ohgiraffers.crewboard.model.CrewBoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewBoardService {

    @Autowired
    private CrewBoardDAO crewBoardDAO;

    public List<CrewBoardDTO> selectAllPosts() {
        List<CrewBoardDTO> postList = crewBoardDAO.selectAllPosts();
        return postList;
    }

}
