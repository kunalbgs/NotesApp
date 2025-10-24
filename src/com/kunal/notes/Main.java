package com.kunal.notes;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotesManager manager = new NotesManager("notes.txt");

        while (true) {
            System.out.println("\n Notes App");
            System.out.println("1. Write a note");
            System.out.println("2. Read all notes");
            System.out.println("3. Exit");
            System.out.print(" Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            sss

            switch (choice) {
                case 1:
                    System.out.print("📝 Enter your note: ");
                    String note = scanner.nextLine();
                    if (Validator.isValidNote(note)) {
                        manager.writeNote(note);
                    } else {
                        System.out.println("⚠️ Invalid note. Please enter something meaningful.");
                    }
                    break;
                case 2:
                    List<String> notes = manager.readNotes();
                    System.out.println("\n📚 Your Notes:");
                    if (notes.isEmpty()) {
                        System.out.println("No notes found.");
                    } else {
                        for (String n : notes) {
                            System.out.println("- " + n);
                        }
                    }
                    break;
                case 3:
                    System.out.println("👋 Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}