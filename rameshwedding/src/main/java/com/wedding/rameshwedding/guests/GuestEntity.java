package com.wedding.rameshwedding.guests;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="guest")
public class GuestEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   private String guestName;
   private Boolean withFamily;
   private Date invationDate;

   public String getGuestName() {
      return guestName;
   }

   public void setGuestName(String guestName) {
      this.guestName = guestName;
   }

   public Boolean getWithFamily() {
      return withFamily;
   }

   public void setWithFamily(Boolean withFamily) {
      this.withFamily = withFamily;
   }

   public Date getInvationDate() {
      return invationDate;
   }

   public void setInvationDate(Date invationDate) {
      this.invationDate = invationDate;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
