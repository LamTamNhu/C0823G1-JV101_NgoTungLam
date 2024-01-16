package com.example.pigpen.service;

import com.example.pigpen.model.Pen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IPenService {
    void save(Pen newPen);

    Page<Pen> getAll(Pageable pageable);
}
