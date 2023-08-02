package com.example.put_get_id.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.put_get_id.model.TutorialModel;

public interface TutorialRepository extends  CrudRepository<TutorialModel,Long>{
    
}
