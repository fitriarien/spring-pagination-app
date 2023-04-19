package com.example.repository;

import com.example.model.Imdbs;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImdbsRepo extends PagingAndSortingRepository<Imdbs, String> {

}
