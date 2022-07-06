package kodlama.io.hrms.entities.concretes;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="personnels")
@NoArgsConstructor
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
