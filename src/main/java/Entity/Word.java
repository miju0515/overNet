package Entity;

import javax.persistence.*;

@Entity
@Table(name="Word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long wordId;

    private String word;
    private String wordDescription;
    private String wordUrl;
}
