package com.example.carlos.lender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class contains the resources that will be required to perform operations
 */
@RestController
@RequestMapping(path = "/users")
public class LenderController {

    private final LenderService lenderService;

    @Autowired
    public LenderController(LenderService lenderService) {
        this.lenderService = lenderService;
    }

    @GetMapping
    public List<Lender> getLenders(){
        return lenderService.getLenders();
    }
    @PostMapping
    public  static void registerUser(@RequestBody Lender lender){
        LenderService.addNewLender(lender);

    }


}
