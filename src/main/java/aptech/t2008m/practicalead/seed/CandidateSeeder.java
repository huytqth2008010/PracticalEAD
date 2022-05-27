package aptech.t2008m.practicalead.seed;

import aptech.t2008m.practicalead.entity.Candidate;
import aptech.t2008m.practicalead.repository.CandidateRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CandidateSeeder implements CommandLineRunner {
    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        if (candidateRepository.findAll().isEmpty()) {
            List<Candidate> candidates = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                candidates.add(Candidate.builder()
                        .name(faker.name().lastName())
                        .addr(null).dateOfBirth(faker.date().birthday())
                        .skill(faker.harryPotter().quote())
                        .workHistory(faker.lorem().word())
                        .build());
            }
            candidateRepository.saveAll(candidates);
        }
    }
}
