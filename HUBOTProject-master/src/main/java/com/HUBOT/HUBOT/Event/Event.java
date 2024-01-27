package com.HUBOT.HUBOT.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
//this class will be used by student to store his events and generate notifications
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("events")
public class Event {
    @Id
    private String eventId;
    @DBRef
    private String studentId;
    private String eventTitle;
    private String message;
    private  int priorityLevel;
    @CreatedDate
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;

}
