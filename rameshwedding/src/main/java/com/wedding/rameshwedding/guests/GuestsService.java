package com.wedding.rameshwedding.guests;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class GuestsService {
    @Autowired
    private GuestsRepository guestsRepository;

    private GuestMapper guestMapper;

    private ModelMapper modelMapper;

    public GuestsService(GuestMapper guestMapper, ModelMapper modelMapper) {
        this.guestMapper = guestMapper;
        this.modelMapper = modelMapper;
    }

    public GuestsDTO.GuestResponse registerGuest(GuestsDTO.GuestRequest guestRequestDTO) {
        var newGuest=guestMapper.dtoToEntity(guestRequestDTO);
        var savedGuest=guestsRepository.save(newGuest);
        var  response=guestMapper.entityToDto(savedGuest);
        return response;
    }


    public GuestsDTO.GuestResponse findGuestById(Long guestId) {

        Optional<GuestEntity> entityOptional=guestsRepository.findById(guestId);

        if(entityOptional.isPresent()){
            GuestEntity entity=entityOptional.get();
            var response=modelMapper.map(entity,GuestsDTO.GuestResponse.class);
            return response;
        }
        return null;
    }
}

