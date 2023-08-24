package com.skcet.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.model.Childmodel;

public interface Childrepo extends JpaRepository<Childmodel, Integer> {

}
