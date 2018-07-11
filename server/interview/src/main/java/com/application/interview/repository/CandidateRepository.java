package com.application.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.interview.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

}
