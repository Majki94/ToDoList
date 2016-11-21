package com.example.rma_user.todolist;

/**
 * Created by rma-user on 11/21/16.
 */

public class Item {

    private String item;
    private boolean status;
    private String date;
    private String time;

    public Item(String item, boolean status, String date, String time) {
        this.item = item;
        this.status = status;
        this.date = date;
        this.time = time;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
