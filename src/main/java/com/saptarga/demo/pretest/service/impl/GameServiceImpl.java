package com.saptarga.demo.pretest.service.impl;

import com.saptarga.demo.pretest.dto.RequestGameDto;
import com.saptarga.demo.pretest.entity.Game;
import com.saptarga.demo.pretest.repository.GameRepository;
import com.saptarga.demo.pretest.service.IGameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class GameServiceImpl implements IGameService {

    private final GameRepository gameRepository;

    @Override
    public Boolean addGame(RequestGameDto requestGameDto) {
        log.info("Create Game {}", requestGameDto.toString());
        gameRepository.save(Game.builder()
                .mdate(requestGameDto.getMatchDate())
                .team1(requestGameDto.getTeam1())
                .team2(requestGameDto.getTeam2())
                .stadium(requestGameDto.getStadium())
                .build());
        return true;
    }

    @Override
    public List<Game> findAllGame() {
        return gameRepository.findAll();
    }
}
