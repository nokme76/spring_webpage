package com.bitc.board.dto;

import lombok.Data;

import java.util.List;

// @Data : lombok 라이브러리에서 지원하는 어노테이션으로 해당 클래스의 멤버 변수에 대한 Getter/Setter/toString() 메서드를 자동으로 생성하는 어노테이션
//  @Getter, @Setter, @ToStirng 어노테이션을 모두 사용한 효과
// @Data
@Data
// DTO(Data Transfer Object) : 데이터 전송 시 사용하기 위한 Java class 객체, DB의 table과 매칭하는데 사용 함
// dto 클래스의 멤버 변수는 매칭되는 DB table의 컬럼명과 동일하게 맞춰야 함 (카멜 명명법 방식으로)
public class BoardDto {
    private int idx;
    private String title;
    private String userId;
    private String pwd;
    private String createDt;
    private String updateDt;
    private String contents;
    private int hitCnt;
    private List<BoardFileDto> fileList;
}
