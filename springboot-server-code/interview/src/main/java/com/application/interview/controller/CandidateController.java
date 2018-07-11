package com.application.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.interview.exception.ResourceNotFoundException;
import com.application.interview.model.Candidate;
import com.application.interview.repository.CandidateRepository;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/interview")
public class CandidateController {

	@Autowired
	CandidateRepository candidateRepository;

	@PostMapping("/savecandidate")
	public Candidate saveCandidate(@RequestBody Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	@GetMapping("/candidates")
	public List<Candidate> getAllCandidates() {
		return candidateRepository.findAll();
	}

	@GetMapping("/candidates/{candidateId}")
	public Candidate getCandidateById(@PathVariable(value = "candidateId") Long candidateId) {
		return candidateRepository.findById(candidateId)
				.orElseThrow(() -> new ResourceNotFoundException("Candidate", "candidateId", candidateId));
	}

	@PutMapping("/candidates/{candidateId}")

	public Candidate updateCandidate(@PathVariable(value = "candidateId") Long candidateId,
			@RequestBody Candidate candidate) {
		return null;
	}

	@DeleteMapping("/candidates/{candidateId}")
	public ResponseEntity<?> deleteCandidate(@PathVariable(value = "candidateId") Long candidateId) {
		Candidate candidate = candidateRepository.findById(candidateId)
				.orElseThrow(() -> new ResourceNotFoundException("Candidate", "candidateId", candidateId));
		candidateRepository.delete(candidate);
		return ResponseEntity.ok().build();
	}

}
