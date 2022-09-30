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
    @GetMapping("/getGuest/{guestId}")
    public ResponseEntity<?> getGuestById(@PathVariable Long guestId){
        var response=guestsService.findGuestById(guestId);
        return response==null ? new ResponseEntity("Guest Not Found with the Id: "+guestId,HttpStatus.NOT_FOUND)
                       : ResponseEntity.ok(response);
    }

    @GetMapping("/guestByFamily/{withOrWithoutFamily}")
    public ResponseEntity<?> guestByWithOrWihoutFamily(@PathVariable Boolean withOrWithoutFamily){
        var response=guestsService.guestByWithOrWihoutFamily(withOrWithoutFamily);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAllGuest")
    public ResponseEntity<?> getAllGuest(){
        return null;
    }
}
