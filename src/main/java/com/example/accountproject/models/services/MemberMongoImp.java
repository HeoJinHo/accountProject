package com.example.accountproject.models.services;

import com.example.accountproject.documents.MemberDTO;
import com.example.accountproject.models.interfaces.MemberSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberMongoImp{

    @Autowired
    private MemberSv memberSv;

    public MemberDTO memberJoin(MemberDTO memberDTO){
        return memberSv.save(memberDTO);
    }

    public List<MemberDTO> getMember()
    {
        return memberSv.findAll();
    }


}
