package pl.betulia.spolecznoscnet.mod;

import javax.persistence.*;

@Entity
public class Relation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


  private long id_inviting; // zapraszające
  private long id_invited;  // zapraszany
  private boolean activation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId_inviting() {
        return id_inviting;
    }

    public void setId_inviting(long id_inviting) {
        this.id_inviting = id_inviting;
    }

    public long getId_invited() {
        return id_invited;
    }

    public void setId_invited(long id_invited) {
        this.id_invited = id_invited;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }
}
