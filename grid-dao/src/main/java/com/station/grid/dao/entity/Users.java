package com.station.grid.dao.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "users")
public class Users extends AbstractEntity {

    @Id
    @Column(
            nullable = false,
            unique = true,
            name = "userid"
    )
    private String userid;
    @Column(name = "username")
    private String username;
    @Column(name = "age")
    private Integer age;
}
