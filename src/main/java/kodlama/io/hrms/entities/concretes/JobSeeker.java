package kodlama.io.hrms.entities.concretes;

import kodlama.io.hrms.core.entities.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "job_seekers")
@Data
@PrimaryKeyJoinColumn(name = "id")
@NoArgsConstructor
@Getter
@Setter
public class JobSeeker extends User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false)
//    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String identityNumber;

    @Column(name="birth_year")
    private String birthYear;
}
