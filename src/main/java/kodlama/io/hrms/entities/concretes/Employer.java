package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employers")
@NoArgsConstructor
@Getter
@Setter
public class Employer {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private Integer phoneNumber;

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
