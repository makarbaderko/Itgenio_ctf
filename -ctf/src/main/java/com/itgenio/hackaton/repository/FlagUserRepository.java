package com.itgenio.hackaton.repository;

import com.itgenio.hackaton.entity.FlagUserSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlagUserRepository extends JpaRepository<FlagUserSolution, Long> {
    List<FlagUserSolution> findAllByUserId(Long id);
}
