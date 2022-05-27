package aptech.t2008m.practicalead.repository;

import aptech.t2008m.practicalead.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}