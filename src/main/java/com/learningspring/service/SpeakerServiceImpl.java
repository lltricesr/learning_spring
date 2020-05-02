package com.learningspring.service;

import com.learningspring.model.Speaker;
import com.learningspring.repository.HibernateSpeakerRepositoryImpl;
import com.learningspring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
