package com.hjc.api.repository;

import com.hjc.api.entity.QuestionEntity;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<QuestionEntity, Integer> {
}
