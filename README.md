# 📘 Student Management System in Java

This is a simple console-based Student Management System developed in Java. The program reads and writes student data to a CSV file and provides the user with basic functionality such as creating, displaying, removing, and searching for students.

---

## 📂 Project Structure

```
student_details.csv    <-- CSV file where student data is stored
app.java               <-- Main Java application file
```

---

## 🛠️ Features

- ✅ Load student data from `student_details.csv`
- ➕ Add new students
- 🔍 Search students by ID
- 🗑️ Remove students by ID
- 👀 Display all student records
- 📄 Automatically update the CSV file with every change

---

## 🧾 CSV Format

The file `student_details.csv` should have the following format:

```
id,name,age
1,Alice,20
2,Bob,22
```

> The first line is the header. Each subsequent line represents one student.

---

## 🖥️ How to Run

1. **Ensure Java is installed**  
   Check with:
   ```bash
   java -version
   ```

2. **Compile the application**
   ```bash
   javac app.java
   ```

3. **Run the application**
   ```bash
   java app
   ```

---

## 🧮 Menu Options

On running the program, you will be prompted with a menu:

```
Welcome to the Student Management System
Please choose an option:
1. Create a new student
2. Display students information
3. Remove a student
4. Search for a student
5. Exit
```

### 1. Create a New Student
- Enter the student's name and age.
- The program automatically assigns a unique ID and saves it to the CSV.

### 2. Display Students
- Lists all students with their ID, name, and age.

### 3. Remove a Student
- Enter the ID of the student to be removed.
- If the ID is found, the student is deleted from memory and the CSV is updated.

### 4. Search for a Student
- Enter the student ID to search.
- If found, the student’s details are displayed.

### 5. Exit
- Closes the program.

---

## 📦 Dependencies

- Pure Java Standard Library
- No external libraries or frameworks used

---

## 📈 Future Improvements

- Add input validation
- Support for editing student records
- Loop the menu until the user exits
- GUI-based interface using JavaFX or Swing
- Store data in a database instead of CSV

---

## 👨‍💻 Author

**Anubhav Shrivastava**  
Student Management System project for learning file handling and data manipulation in Java.