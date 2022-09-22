package com.wedding.rameshwedding.guests;

import lombok.Data;

import java.util.Date;

public class GuestsDTO {



    @Data
    public static class GuestRequest{
        private String guestName;
        private Boolean withFamily;
        private String relation;

    }

    @Data
    public static class GuestResponse{
        private String guestName;
        private Boolean withFamily;
        private String relation;
        private Date invitationDate;


    }
}
