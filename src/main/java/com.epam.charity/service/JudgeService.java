package com.epam.charity.service;

import com.epam.charity.dto.entity.JudgeDto;

import java.util.List;
import java.util.Optional;

public interface JudgeService {

    Optional<JudgeDto> getJudgeByName(String name);

    Optional<JudgeDto> getJudgeById(long id);

    void createJudge(JudgeDto judgeDto);

    void removeJudge(JudgeDto judgeDto);

    void updateJudge(JudgeDto judgeDto);

    List<JudgeDto> getAllJudge();
}
