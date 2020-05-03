package com.learningspring.service;

import com.learningspring.model.Speaker;
import com.learningspring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {}

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }


    //public void setSpeakerRepository(SpeakerRepository repository) {
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
