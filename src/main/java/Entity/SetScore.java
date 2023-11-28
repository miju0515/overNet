package Entity;

import javax.persistence.*;

@Entity
@Table(name="SetScore")
public class SetScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long setId;
    private long gameId;

    private int h_set1;
    private int a_set1;
    private int h_set2;
    private int a_set2;
    private int h_set3;
    private int a_set3;
    private int h_set4;
    private int a_set4;
    private int h_set5;
    private int a_set5;
}
