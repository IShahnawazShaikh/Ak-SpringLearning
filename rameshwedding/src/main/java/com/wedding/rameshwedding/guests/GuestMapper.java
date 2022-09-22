package com.wedding.rameshwedding.guests;


import java.util.Date;

public class GuestMapper {

    public GuestMapper(){

    }
    public GuestEntity dtoToEntity(GuestsDTO.GuestRequest guestRequestDTO) {
        GuestEntity guestEntity=new GuestEntity();
        guestEntity.setGuestName(guestRequestDTO.getGuestName());
        guestEntity.setWithFamily(guestRequestDTO.getWithFamily());
        guestEntity.setRelation(guestRequestDTO.getRelation());
        guestEntity.setInvitationDate(new Date());
        return guestEntity;
    }

    public GuestsDTO.GuestResponse entityToDto(GuestEntity savedGuest) {
        GuestsDTO.GuestResponse response=new GuestsDTO.GuestResponse();

        response.setGuestName(savedGuest.getGuestName());
        response.setWithFamily(savedGuest.getWithFamily());
        response.setRelation(savedGuest.getRelation());
        response.setInvitationDate(savedGuest.getInvitationDate());
        return response;

    }
}
