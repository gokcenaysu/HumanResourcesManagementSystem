package kodlama.io.hrms.entities.concretes;

import kodlama.io.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@NoArgsConstructor
@Getter
@Setter
public class Employer extends User {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;*/

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

/*    @Column(name="email")
    private String email;*/

    @Column(name="phone_number")
    private String phoneNumber;

  /*  @Column(name="password")
    private String password;*/

    public Employer(String companyName, String website, String phoneNumber)  {
        super();
        this.companyName = companyName;
        this.website = website;
        this.phoneNumber = phoneNumber;
    }
}
