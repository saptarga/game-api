package com.saptarga.demo.pretest.endpoint.impl;

import com.saptarga.demo.pretest.dto.RequestGameDto;
import com.saptarga.demo.pretest.dto.ResponseGameDto;
import com.saptarga.demo.pretest.endpoint.IGameEndpoint;
import com.saptarga.demo.pretest.entity.Game;
import com.saptarga.demo.pretest.service.IGameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@Slf4j
public class GameEndPointImpl implements IGameEndpoint {

    private final IGameService gameService;

    @Override
    public ResponseEntity<String> addGame(RequestGameDto requestGameDto) {
        log.info(requestGameDto.toString());
        gameService.addGame(requestGameDto);
        return ResponseEntity.ok("Sukses");
    }

    @Override
    public ResponseEntity<List<ResponseGameDto>> getGame() {
        List<Game> games = gameService.findAllGame();
        List<ResponseGameDto> responseGameDtos = new ArrayList<>();
        if (games.isEmpty()){
            return ResponseEntity.ok(responseGameDtos);
        }
        responseGameDtos = games.stream().map(x -> ResponseGameDto.builder()
                .mDate(x.getMdate())
                .team1(x.getTeam1())
                .team2(x.getTeam2())
                .stadium(x.getStadium())
                .build()).collect(Collectors.toList());
        return ResponseEntity.ok(responseGameDtos);
    }
}
