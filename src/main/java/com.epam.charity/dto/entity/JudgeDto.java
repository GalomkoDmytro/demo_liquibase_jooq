package com.epam.charity.dto.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JudgeDto {

    private String id;
    private String fullName;
    private String name;
    private String email;
    private String password;
    private String title;
    private String description;

    private boolean isAdmin;
}
