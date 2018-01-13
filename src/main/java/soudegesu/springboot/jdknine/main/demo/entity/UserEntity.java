package soudegesu.springboot.jdknine.main.demo.entity;

import javax.persistence.*;
import java.util.Date;
//import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

//    @Column
//    private Timestamp time;

}
