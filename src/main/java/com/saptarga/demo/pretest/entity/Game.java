package com.saptarga.demo.pretest.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "game")
public class Game implements Serializable {

    private static final long serialVersionUID = -9165612279085724396L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_id_seq")
    @SequenceGenerator(name = "game_id_seq", sequenceName = "game_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "mdate")
    private String mdate;

    @Column(name = "team1")
    private String team1;

    @Column(name = "team2")
    private String team2;

    @Column(name = "stadium")
    private String stadium;

}
