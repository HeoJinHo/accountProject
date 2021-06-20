package com.example.accountproject.documents;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "member")
@Data
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

    private MemberDetailDTO memberDetail;

    /*사용자 권한*/
    private String memberAuth;


}
