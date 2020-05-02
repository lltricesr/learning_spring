package com.learningspring.service;

import com.learningspring.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
