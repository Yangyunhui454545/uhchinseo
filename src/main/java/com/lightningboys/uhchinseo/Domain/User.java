package com.lightningboys.uhchinseo.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name = "user_nickname")
    private String nickname;

    @Column(name ="create_time")
    private Date createtime;

    @Column(name="user_score")
    private int score;
}
