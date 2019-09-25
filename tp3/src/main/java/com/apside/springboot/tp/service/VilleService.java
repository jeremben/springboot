package com.apside.springboot.tp.service;

import com.apside.springboot.tp.dto.VilleDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VilleService {

    List<VilleDto> villeDtoList;

    public VilleService() {
        villeDtoList = new ArrayList<>();
    }

    public VilleDto getVille(long idVille) {
        return villeDtoList.get((int) idVille - 1);
    }

    public void addVilleToList(List<VilleDto> villeDtoListToAdd) {
        for(VilleDto villeDtoToAdd : villeDtoListToAdd) {
            villeDtoList.add(villeDtoToAdd);
        }
    }
}
