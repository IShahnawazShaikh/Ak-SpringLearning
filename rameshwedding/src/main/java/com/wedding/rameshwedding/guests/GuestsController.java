package com.wedding.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guest")
public class GuestsController {


    private GuestsService guestsService;

    public GuestsController(GuestsService guestsService) {
        this.guestsService = guestsService;
    }


    @PostMapping("/registerGuest")
    public ResponseEntity registerGuest(@RequestBody GuestsDTO.GuestRequest requestDTO){

        var response=guestsService.registerGuest(requestDTO);


        return new ResponseEntity(response,HttpStatus.CREATED);

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
