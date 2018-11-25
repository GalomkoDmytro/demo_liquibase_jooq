package com.epam.charity.dao;

import com.epam.charity.dto.entity.JudgeDto;

import java.util.List;
import java.util.Optional;

public interface JudgeDao {

    Optional<JudgeDto> getJudgeByName(String name);

    Optional<JudgeDto> getJudgeById(long id);

    void createJudge(JudgeDto judgeDto);

    void removeJudge(JudgeDto judgeDto);

    void updateJudge(JudgeDto judgeDto);

    List<JudgeDto> getAllJudge();

}
