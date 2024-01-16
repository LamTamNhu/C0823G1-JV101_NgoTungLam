package com.example.pigpen.repository;

import com.example.pigpen.model.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPenRepository extends JpaRepository<Pen,Long> {
}
