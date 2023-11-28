package Entity;

import javax.persistence.*;

@Entity
@Table(name="SiteUser")
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String id;
    private String password;
    private String nickname;
    private String likeClub;
}
