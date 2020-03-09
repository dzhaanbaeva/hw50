package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class UserSubscriptions {

    @Id
    private String id;
    private  String userIdr1;
    private String userId2;
    private LocalDateTime eventsDate;

    public UserSubscriptions(String userIdr1, String userId2) {
        this.userIdr1 = userIdr1;
        this.userId2 = userId2;
        eventsDate = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserIdr1() {
        return userIdr1;
    }

    public void setUserIdr1(String userIdr1) {
        this.userIdr1 = userIdr1;
    }

    public String getUserId2() {
        return userId2;
    }

    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

    public LocalDateTime getEventsDate() {
        return eventsDate;
    }

    public void setEventsDate(LocalDateTime eventsDate) {
        this.eventsDate = eventsDate;
    }
}
