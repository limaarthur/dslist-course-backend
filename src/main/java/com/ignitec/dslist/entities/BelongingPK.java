package com.ignitec.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_belongingpk")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class BelongingPK {

    @Id
    @ManyToOne
    @JoinColumn(name = "tb_game", insertable = false, updatable = false)
    private Game game;

    @Id
    @ManyToOne
    @JoinColumn(name = "tb_game_list", insertable = false, updatable = false)
    private GameList gameList;
}
