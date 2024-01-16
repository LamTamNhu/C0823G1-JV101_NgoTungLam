package com.example.pigpen.service;

import com.example.pigpen.model.Pen;
import com.example.pigpen.repository.IPenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class PenService implements IPenService {
    @Autowired
    IPenRepository penRepository;

    @Override
    public void save(Pen newPen) {
        penRepository.save(newPen);
    }

    @Override
    public Page<Pen> getAll(Pageable pageable) {
        return penRepository.findAll(pageable);
    }
}
