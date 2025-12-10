# Java Server Projects

This repository showcases two TCP server implementations in Java, designed for learning and performance comparison:

- 🚦 **Single-Threaded Server**
- ⚡ **Multi-Threaded Server**

Each implementation is placed in its own directory and demonstrates different approaches to handling client connections.

---

## 📁 Directory Structure

```
JavaServerProjects/
├── SingleThreadedServer/
├── MultiThreadedServer/
└── README.md
```

---

## 🚦 Single-Threaded Server

A basic TCP server that handles **one client at a time**.  
Ideal for understanding Java networking fundamentals and blocking I/O.

### 🔹 Features
- Accepts one connection at a time  
- Uses `ServerSocket` and standard I/O streams  
- Very simple and beginner-friendly  

---

## ⚡ Multi-Threaded Server

A more advanced TCP server that handles **multiple clients concurrently** using threads.

### 🔹 Features
- Each client is handled in its own thread  
- Scales better for real-world use cases  
- Demonstrates Java threading & socket handling  

---

## 🧪 How to Run

### 1️⃣ Navigate to your desired server folder  
```bash
cd SingleThreadedServer   # or MultiThreadedServer
```

### 2️⃣ Compile the Java files  
```bash
javac -d bin src/*.java
```

### 3️⃣ Run the server  
```bash
java -cp bin MainClassName
```

> Replace `MainClassName` with the actual main class (e.g., `Server`, `Main`, etc.)

---

## 💡 Use Case

- Learning socket programming in Java  
- Comparing blocking vs. concurrent server performance  
- Building custom lightweight servers  
- Understanding differences between single-thread and multi-thread models  

---

## 💌 Contact & Support

📧 **Email:** uanurag@gmail.com  
📌 **GitHub:** https://github.com/Uanuragdhyay
