package com.ohgiraffers.crewboard.model;

import com.ohgiraffers.crewboard.dto.CrewBoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CrewBoardDAO {

    List<CrewBoardDTO> selectAllPosts();
}
