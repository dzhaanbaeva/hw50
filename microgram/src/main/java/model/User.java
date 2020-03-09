package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;

    private String name;
    private  String email;
    private String password;
    private int publicationCount = 0;
    private int subscriptionsCount = 0;
    private  int subscribersCount = 0;


    public User(String name, String email,
                String password,
                int publicationCount,
                int subscriptionsCount, int subscribersCount) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.publicationCount = publicationCount;
        this.subscriptionsCount = subscriptionsCount;
        this.subscribersCount = subscribersCount;
    }

    public User(String name, String email,
                int publicationCount,
                int subscriptionsCount, int subscribersCount) {
        this.name = name;
        this.email = email;
        this.publicationCount = publicationCount;
        this.subscriptionsCount = subscriptionsCount;
        this.subscribersCount = subscribersCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPublicationCount() {
        return publicationCount;
    }

    public void setPublicationCount(int publicationCount) {
        this.publicationCount = publicationCount;
    }

    public int getSubscriptionsCount() {
        return subscriptionsCount;
    }

    public void setSubscriptionsCount(int subscriptionsCount) {
        this.subscriptionsCount = subscriptionsCount;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }
}
