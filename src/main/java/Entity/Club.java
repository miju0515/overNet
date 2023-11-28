package Entity;

import javax.persistence.*;

@Entity
@Table(name="Club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clubId;

    private String clubName;
    private String mainColor;
    private String subColor;
}
