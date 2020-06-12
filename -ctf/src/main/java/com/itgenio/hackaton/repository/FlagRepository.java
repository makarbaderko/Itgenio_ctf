package com.itgenio.hackaton.repository;

import com.itgenio.hackaton.entity.Flag;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlagRepository extends JpaRepository<Flag, Long> {
   Flag findFlagById(Long id);
   Flag findFlagByFlagKey(String key);
}
