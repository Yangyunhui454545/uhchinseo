package com.lightningboys.uhchinseo.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Balance_Game")
@Getter @Setter
public class BalanceGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "balance_id")
    private Long id;
    @Column(name = "balance_question")
    private String question;
    @Column(name= "balance_count")
    private int cnt;
    @Column(name = "balance_category")
    private String category;
}
