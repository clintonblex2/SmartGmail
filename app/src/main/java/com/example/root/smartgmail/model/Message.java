package com.example.root.smartgmail.model;

//This model class is used for deserializing JSON while parsing
public class Message {
    private int id;
    private String from;
    private String subject;
    private String message;
    private String timestamp;
    private String picture;
    public Boolean isImportant;
    public Boolean isRead;
    private int color = -1;

    //Message empty constructor
    public Message(){
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFrom(){
        return from;
    }
    public void setFrom(String from){
        this.from = from;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    public String getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }

    public String getPicture(){
        return picture;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }

    public boolean isImportant(){
        return isImportant;
    }
    public void setIsImportant(boolean isImportant){
        this.isImportant = isImportant;
    }

    public boolean isRead(){
        return isRead;
    }
    public void setRead(boolean isRead){
        this.isRead = isRead;
    }

    public int getColor(){
        return color;
    }
    public void setColor(int color){
        this.color = color;
    }
}
