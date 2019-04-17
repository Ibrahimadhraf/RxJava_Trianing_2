package com.example.android.rxjava_trianing_2;

public class Note {
    int id;
    String note;

    public int getId() {
        return id;
    }

    public Note(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
