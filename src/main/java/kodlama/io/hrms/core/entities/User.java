package kodlama.io.hrms.core.entities;

import com.sun.istack.NotNull;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    @Column(nullable = false)
    private int id;

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
