package com.lightningboys.uhchinseo.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "new_word_game")
@Getter @Setter
public class NewWordGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "new_word_id")
    private Long id;

    @Column(name = "new_word_question")
    private String question;

    @Column(name = "new_word_category")
    private String category;

    @Column(name = "new_word_selection")
    private String selection;

    @Column(name = "new_word_answer")
    private Character answer;
}
