package com.kunal.notes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NotesManager {
    private final String fileName;

    public NotesManager(String fileName) {
        this.fileName = fileName;
    }

    public void writeNote(String note) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(note + "\n");
            System.out.println("✅ Note saved.");
        } catch (IOException e) {
            System.out.println("❌ Error writing note: " + e.getMessage());
        }
    }

    public List<String> readNotes() {
        List<String> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                notes.add(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading notes: " + e.getMessage());
        }
        return notes;
    }
}