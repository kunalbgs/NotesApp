📒 NotesApp – Java File I/O Project
A simple console-based Notes Manager built in Java using FileWriter and BufferedReader. This app allows users to write and read notes from a local text file. Designed with clean package structure, input validation, and modular classes—ideal for beginners transitioning into tech roles.

🚀 Features
- ✍️ Write notes to a file (notes.txt)
- 📖 Read all saved notes
- ⚠️ Input validation (no blank notes)
- 📦 Organized with packages and multiple classes
- 🧪 Runs in IntelliJ IDEA Community Edition

🧱 Project Structure
NotesApp/
├── src/
│   └── com/kunal/notes/
│       ├── Main.java           // App runner
│       ├── NotesManager.java   // File I/O logic
│       └── Validator.java      // Input validation
└── notes.txt                   // Stores notes



🛠️ Technologies Used
- Java 17+
- IntelliJ IDEA Community Edition
- File I/O (FileWriter, BufferedReader)
- Scanner for user input

📦 How to Run in IntelliJ
- Create New Project → Java → No template → Name: NotesApp
- Inside src, create package: com.kunal.notes
- Add three classes:
- Main.java
- NotesManager.java
- Validator.java
- Paste code into respective files (see below)
- Right-click Main.java → Run

📄 Code Overview
🔹 Main.java
Handles user interaction and menu logic.
Scanner scanner = new Scanner(System.in);
NotesManager manager = new NotesManager("notes.txt");


🔹 NotesManager.java
Handles reading and writing notes to file.
FileWriter fw = new FileWriter(fileName, true);
BufferedReader br = new BufferedReader(new FileReader(fileName));


🔹 Validator.java
Validates that notes are not empty or blank.
return note != null && !note.trim().isEmpty();



✅ Sample Output


<img width="1920" height="1024" alt="Screenshot (12)" src="https://github.com/user-attachments/assets/d399d71e-f245-4b0f-bc70-bc37a8dea10d" />


📒 Notes App
1. Write a note
2. Read all notes
3. Exit
👉 Choose option: 1
📝 Enter your note: Learn Java File I/O
✅ Note saved.



📌 Future Enhancements
- Add timestamps to notes
- Categorize notes by topic
- Search notes by keyword
- Encrypt notes for privacy

👤 Author
Kunal
