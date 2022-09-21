package com.wedding.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class GuestsService {
    @Autowired
    private GuestsRepository guestsRepository;

    private GuestMapper guestMapper;

    public GuestsService(GuestMapper guestMapper) {
        this.guestMapper = guestMapper;
    }

    public GuestsDTO.GuestResponse registerGuest(GuestsDTO.GuestRequest guestRequestDTO) {
        var newGuest=guestMapper.dtoToEntity(guestRequestDTO);
        var savedGuest=guestsRepository.save(newGuest);
        var  response=guestMapper.entityToDto(savedGuest);
        return response;
    }

}

