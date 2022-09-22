package com.wedding.rameshwedding.guests;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="guest")
public class GuestEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   private String guestName;
   private Boolean withFamily;
   private Date invitationDate;
   private String relation;

}
