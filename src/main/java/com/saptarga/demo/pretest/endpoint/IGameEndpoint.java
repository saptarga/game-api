package com.saptarga.demo.pretest.endpoint;

import com.saptarga.demo.pretest.dto.RequestGameDto;
import com.saptarga.demo.pretest.dto.ResponseGameDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/game")
public interface IGameEndpoint {

    @PostMapping
    ResponseEntity<String> addGame(@RequestBody RequestGameDto requestGameDto);

    @GetMapping
    ResponseEntity<List<ResponseGameDto>> getGame();
}
