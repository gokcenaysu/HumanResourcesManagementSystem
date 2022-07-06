package kodlama.io.hrms.entities.concretes;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="employers")
@NoArgsConstructor
public class Employer {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private int phoneNumber;

    @Column(name="password")
    private String password;

    public Employer(int id, String companyName, String website, String email, int phoneNumber, String password) {
        this.id = id;
        this.companyName = companyName;
        this.website = website;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
