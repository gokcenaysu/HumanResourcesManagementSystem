package kodlama.io.hrms.core.entities;

import kodlama.io.hrms.entities.concretes.Employer;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    public User(int id, String email, String password) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
