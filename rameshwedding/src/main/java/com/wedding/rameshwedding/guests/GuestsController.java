package com.wedding.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/guest")
public class GuestsController {


    GuestsService guestsService;

    public GuestsController(GuestsService guestsService) {
        this.guestsService = guestsService;
    }


    @PostMapping("/registerGuest")
    public ResponseEntity registerGuest(@RequestParam String guestName,@RequestParam Boolean withFamily){

        var response=guestsService.registerGuest(guestName,withFamily);


        return ResponseEntity.ok(response);
    }
//
//    @GetMapping("/geGuest/{guestId}")
//    public ResponseEntity<?> getGuestById(){
//        return null;
//    }
//
//    @GetMapping("/getAllGuest")
//    public ResponseEntity<?> getAllGuest(){
//        return null;
//    }
}
