package com.learningspring.repository;

import com.learningspring.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Monty");
        speaker.setLastName("Trice");

        speakers.add(speaker);

        return speakers;
    }
}
