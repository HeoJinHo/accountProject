package com.example.accountproject.models.services;

import com.example.accountproject.documents.MemberDTO;
import com.example.accountproject.models.interfaces.MemberSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MemberSvImp {


    @Autowired
    private MemberSv memberSv;


    public MemberDTO membersave(MemberDTO memberDTO)
    {
        return memberSv.save(memberDTO);
    }


}
