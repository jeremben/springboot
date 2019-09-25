package com.apside.springboot.tp.controller;

import com.apside.springboot.tp.dto.VilleDto;
import com.apside.springboot.tp.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VilleController {

    @Autowired
    VilleService villeService;

    @RequestMapping("ville/{idVille}")
    public VilleDto getVille(@PathVariable long idVille) {
        return villeService.getVille(idVille);
    }

    @PostMapping
    public ResponseEntity addVille(@RequestBody List<VilleDto> villeDtoList) {
        villeService.addVilleToList(villeDtoList);

        return ResponseEntity.ok(HttpStatus.OK);
    }

}
