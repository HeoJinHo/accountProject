package com.example.accountproject.documents;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDetailDTO {

    /*사용자 우편번호*/
    private String memberZipCode;

    /*사용자 주소*/
    private String memberAddress;

    /*사용자 상세주소*/
    private String memberAddressDetail;

}
