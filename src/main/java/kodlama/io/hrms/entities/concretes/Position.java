package kodlama.io.hrms.entities.concretes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "positions")
@NoArgsConstructor
@Getter
@Setter
public class Position {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="position_name")
    private String positionName;

    public Position(int id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }
}
