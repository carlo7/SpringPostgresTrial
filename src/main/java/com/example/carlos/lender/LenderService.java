package com.example.carlos.lender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenderService {
    private final LenderRepo lenderRepo;

     @Autowired
     public LenderService(LenderRepo lenderRepo) {
     this.lenderRepo = lenderRepo;
     }

 public static void addNewLender(Lender lender) {
     System.out.println(lender);
 }

 public List<Lender> getLenders(){
     return lenderRepo.findAll();
     }
}
