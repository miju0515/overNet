package Entity;

import javax.persistence.*;

@Entity
@Table(name="Collection")
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long collectionId;

    private long gameId;
    private long userId;

    private boolean isCollected;
}
