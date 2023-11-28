package Entity;

import javax.persistence.*;

@Entity
@Table(name="Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;
    private long collectionId;

    private String review;
}
