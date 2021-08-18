package com.saptarga.demo.pretest.service;

import com.saptarga.demo.pretest.dto.RequestGameDto;
import com.saptarga.demo.pretest.entity.Game;

import java.util.List;

public interface IGameService {

    Boolean addGame(RequestGameDto requestGameDto);

    List<Game> findAllGame();
}
