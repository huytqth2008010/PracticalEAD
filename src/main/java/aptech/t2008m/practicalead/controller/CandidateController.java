package aptech.t2008m.practicalead.controller;

import aptech.t2008m.practicalead.entity.Candidate;
import aptech.t2008m.practicalead.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/candidates")
public class CandidateController {
    @Autowired
    CandidateService candidateService;
    @GetMapping
    public ResponseEntity<?> getList(){
        return ResponseEntity.ok(candidateService.findPage());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Candidate candidate){
        return ResponseEntity.status(HttpStatus.CREATED).body(candidateService.save(candidate));
    }
}