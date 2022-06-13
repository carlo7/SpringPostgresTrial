package com.example.carlos.lender;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//To implement Data Access Layer
@Repository
public interface LenderRepo extends JpaRepository<Lender, Long> {
}
