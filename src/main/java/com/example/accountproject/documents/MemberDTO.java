package com.example.accountproject.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document
public class MemberDTO {

    /*사용자 아이디*/
    @Id
    private String memberId;

    /*사용자 비밀번호*/
    private String memberPwd;

    /*사용자 이름*/
    private String memberName;

    /*사용자 영문 이름*/
    private String memberEName;

    /*사용자 회사*/
    private String memberCompany;

    /*사용자 전화번호*/
    private String memberPhone;

    /*사용자 우편번호*/
    private String memberZipCode;

    /*사용자 주소*/
    private String memberAddress;

    /*사용자 상세주소*/
    private String memberAddressDetail;

    /*사용자 권한*/
    private String memberAuth;

    /*회원가입일 및 등록일자*/
    @CreatedDate
    private Date createdDate;


}
