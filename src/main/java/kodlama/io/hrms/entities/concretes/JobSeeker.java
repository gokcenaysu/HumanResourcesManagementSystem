package kodlama.io.hrms.entities.concretes;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="job_seekers")
@NoArgsConstructor
public class JobSeeker {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private int identityNumber;

    @Column(name="birth_year")
    private int birthYear;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    public JobSeeker(int id, String firstName, String lastName, int identityNumber, int birthYear, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.birthYear = birthYear;
        this.email = email;
        this.password = password;
    }
}
