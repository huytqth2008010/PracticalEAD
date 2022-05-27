package aptech.t2008m.practicalead.service;

import aptech.t2008m.practicalead.entity.Candidate;
import aptech.t2008m.practicalead.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    public List<Candidate> findPage(){
        return candidateRepository.findAll();
    }
    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }

}