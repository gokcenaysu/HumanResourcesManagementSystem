package kodlama.io.hrms.entities.concretes;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personnels")
@NoArgsConstructor
@Getter
@Setter
public class Personnel {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    public Personnel(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
