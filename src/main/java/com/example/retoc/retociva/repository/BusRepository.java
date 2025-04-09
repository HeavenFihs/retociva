package com.example.retoc.retociva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.retoc.retociva.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
    
}
