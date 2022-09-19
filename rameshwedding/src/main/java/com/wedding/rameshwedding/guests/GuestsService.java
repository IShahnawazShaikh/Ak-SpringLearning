package com.wedding.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class GuestsService {
    @Autowired
    private GuestsRepository guestsRepository;
    public GuestsDTO.GuestResponse registerGuest(GuestsDTO.GuestRequest guestRequestDTO) {
        GuestEntity newGuest=new GuestEntity();

        newGuest.setGuestName(guestRequestDTO.getGuestName());
        newGuest.setWithFamily(guestRequestDTO.getWithFamily());
        newGuest.setRelation(guestRequestDTO.getRelation());
        newGuest.setInvationDate(new Date());



        var savedGuest=guestsRepository.save(newGuest);

        var guestResponseDto= new GuestsDTO.GuestResponse();
        guestResponseDto.setGuestName(savedGuest.getGuestName());
        guestResponseDto.setWithFamily(savedGuest.getWithFamily());
        guestResponseDto.setRelation(savedGuest.getRelation());
        guestResponseDto.setInvitationDate(savedGuest.getInvationDate());


        return guestResponseDto;
    }
}

