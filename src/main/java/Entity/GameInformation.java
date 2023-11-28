package Entity;

import javax.persistence.*;

@Entity
@Table(name="GameInformation")
public class GameInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long informationId;

    private long gameId;
    private int set;
    private String situation;
    private String playerName;
    private boolean isHome;
}
