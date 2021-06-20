package com.example.accountproject.models.interfaces;

import com.example.accountproject.documents.MemberDTO;
import com.example.accountproject.models.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSv extends CommonRepository<MemberDTO, String> {


    MemberDTO member_save(MemberDTO memberDTO);

}
