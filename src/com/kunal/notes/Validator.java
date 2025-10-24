package com.kunal.notes;

public class Validator {
    public static boolean isValidNote(String note) {
        return note != null && !note.trim().isEmpty();
    }
}