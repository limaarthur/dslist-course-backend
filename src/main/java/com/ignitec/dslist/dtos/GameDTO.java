package com.ignitec.dslist.dtos;

import com.ignitec.dslist.entities.Game;

public record GameDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
