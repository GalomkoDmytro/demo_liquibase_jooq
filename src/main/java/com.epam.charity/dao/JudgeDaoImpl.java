package com.epam.charity.dao;

import com.epam.charity.dto.entity.JudgeDto;

import java.util.List;
import java.util.Optional;

public class JudgeDaoImpl implements JudgeDao {

    @Override
    public Optional<JudgeDto> getJudgeByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<JudgeDto> getJudgeById(long id) {
        return Optional.empty();
    }

    @Override
    public void createJudge(JudgeDto judgeDto) {

    }

    @Override
    public void removeJudge(JudgeDto judgeDto) {

    }

    @Override
    public void updateJudge(JudgeDto judgeDto) {

    }

    @Override
    public List<JudgeDto> getAllJudge() {
        return null;
    }
}
