package com.learningspring.repository;

import com.learningspring.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
