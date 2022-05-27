package aptech.t2008m.practicalead.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "candidates")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Candidate {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private String addr;
    private Date dateOfBirth;
    private String skill;
    private String workHistory;

}