package com.vinaykumarkare.mobilestore.converter;

import com.vinaykumarkare.mobilestore.dto.MobilesDTO;
import com.vinaykumarkare.mobilestore.entity.Mobiles;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MobilesConverter {

    @Autowired
    private ModelMapper modelMapper;

    public MobilesDTO entityToDto(Mobiles mobiles){
        return modelMapper.map(mobiles,MobilesDTO.class);
    }

    public List<MobilesDTO> entityToDto(List<Mobiles> mobiles){
        return mobiles.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public Mobiles dtoToEntity(MobilesDTO mobilesDTO){
        return modelMapper.map(mobilesDTO,Mobiles.class);
    }
}
