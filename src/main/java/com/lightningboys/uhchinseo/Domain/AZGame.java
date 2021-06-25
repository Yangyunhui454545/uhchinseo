package com.lightningboys.uhchinseo.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "az_game")
@Getter @Setter
public class AZGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "az_id")
    private Long id;

    @Column(name = "az_question")
    private String question;

    @Column(name="az_selection")
    private String selection;

    @Column(name = "az_answer")
    private String answer;

    @Column(name = "az_category")
    private Character category;

}

