package com.bixbox.admin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
public class ExamDto {
    @NotEmpty(message = "필수 입력값입니다")
    private Long classId;
    @NotEmpty(message = "필수 입력값입니다")
    private String examName;
    @NotEmpty(message = "필수 입력값입니다")
    private Long perfectScore;
}
