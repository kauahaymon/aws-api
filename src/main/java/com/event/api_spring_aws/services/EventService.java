package com.event.api_spring_aws.services;

import com.event.api_spring_aws.domain.Event;
import com.event.api_spring_aws.dtos.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.stream.Stream;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data) {
        String imgUrl = null;
        if (data.image() != null) {
            imgUrl = this.uploadImage(data.image());
        }
        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);

        return newEvent;
    }

    private String uploadImage(MultipartFile image) {
        return "";
    }
}
