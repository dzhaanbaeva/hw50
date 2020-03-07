package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class ILikeIt {
     @Id
     private String id;

     private String userId;
     private String publicationId;
     private LocalDateTime likeTime;

    public ILikeIt(String userId, String publicationId) {
        this.userId = userId;
        this.publicationId = publicationId;
        likeTime = LocalDateTime.now();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public LocalDateTime getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(LocalDateTime likeTime) {
        this.likeTime = likeTime;
    }
}
