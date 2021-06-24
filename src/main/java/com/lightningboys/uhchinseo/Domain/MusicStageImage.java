package com.lightningboys.uhchinseo.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Music_Stage_Image")
@Getter @Setter
public class MusicStageImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "music_stage_image_id")
    private Long id;

    @Lob
    @Column(name = "music_stage_image")
    private byte[] image;
}
