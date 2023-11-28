package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gameId;

    private int session;
    private int round;
    private LocalDate date;
    private String homeTeam;
    private int homeSet;
    private String awayTeam;
    private int awaySet;
}
