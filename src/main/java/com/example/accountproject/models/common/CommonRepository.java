package com.example.accountproject.models.common;
import com.example.accountproject.documents.MemberDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.RepositoryDefinition;

import java.io.Serializable;

@NoRepositoryBean
public interface CommonRepository<T, ID extends Serializable> extends MongoRepository<T, ID> {

    <E extends T> E save(E entity);
}
