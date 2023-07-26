package Connection;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="`group`")
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name= "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    public Group(){

    }
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}

