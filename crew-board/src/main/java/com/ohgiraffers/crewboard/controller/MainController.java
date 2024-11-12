package com.ohgiraffers.crewboard.controller;

import com.ohgiraffers.crewboard.dto.CrewBoardDTO;
import com.ohgiraffers.crewboard.service.CrewBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    @ResponseBody
    @PostMapping("/imgUpload")
    public Map<String, Object> imgUpload(@RequestParam Map<String,Object> paramMap, MultipartRequest request) {

        MultipartFile uploadImg = request.getFile("upload");

        // 업로드 파일 저장 경로 설정
        String uploadDir = "C:/uploads/temp";
        File fileDir = new File(uploadDir);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }

        // 원본 파일 이름
        String originalFileName = uploadImg.getOriginalFilename();
        // 확장자명 추출
        String ext = originalFileName.substring(originalFileName.lastIndexOf(".")); // .뒤의 확장자명만 담기
        // UUID.randomUUID() 고유 식별자 생성
        String savedName = UUID.randomUUID().toString() + ext;

        try {
            uploadImg.transferTo(new File(fileDir + "/" + savedName));
            paramMap.put("url", fileDir + "/" + savedName);
        } catch (IOException e) {
            e.printStackTrace();
            paramMap.put("error", e.getMessage());
        }
        return paramMap;


    }

}
