package com.wedding.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class GuestsService {
    @Autowired
    private GuestsRepository guestsRepository;
    public GuestEntity registerGuest(String guestName, Boolean withFamily) {
        GuestEntity newGuest=new GuestEntity();
        newGuest.setGuestName(guestName);
        newGuest.setWithFamily(withFamily);
        newGuest.setInvationDate(new Date());
        var savedGuest=guestsRepository.save(newGuest);
        return savedGuest;
    }
}

