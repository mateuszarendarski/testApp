package springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String firstName;

    @Column
    private String lastName;

    public User() {
    }
}
