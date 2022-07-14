package kodlama.io.hrms.entities.concretes;

import kodlama.io.hrms.core.entities.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="employers")
@Data
@PrimaryKeyJoinColumn(name = "id")
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

}
