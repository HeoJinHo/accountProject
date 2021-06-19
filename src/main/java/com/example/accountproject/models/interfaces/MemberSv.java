package com.example.accountproject.models.interfaces;
import com.example.accountproject.documents.MemberDTO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSv extends MongoRepository<MemberDTO, String> {


    MemberDTO membersave(MemberDTO memberDTO);


}
