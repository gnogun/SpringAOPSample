package com.gno.sample.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gno.sample.dto.TxTest;

public interface TxTestRepository extends PagingAndSortingRepository<TxTest, Integer>{

}
