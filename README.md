# Java Server Projects

This repository showcases two TCP server implementations in Java, designed for learning and performance comparison:

- 🚦 **Single-Threaded Server**
- ⚡ **Multi-Threaded Server**

Each implementation is in its own directory and demonstrates different approaches to handling client connections.

---

## 📁 Directory Structure

```
JavaServerProjects/
├── SingleThreadedServer/
├── MultiThreadedServer/
└── README.md

````

---

## 🚦 Single-Threaded Server

This is a basic TCP server that handles **one client at a time**. It is useful for understanding Java networking and blocking I/O.

### 🔹 Features:
- Accepts one connection at a time
- Uses `ServerSocket` and basic I/O streams
- Simple and easy to understand

---

## ⚡ Multi-Threaded Server

This server handles **multiple clients concurrently** using threads. It is ideal for building more responsive applications.

### 🔹 Features:
- Each client is handled in its own thread
- Better scalability for concurrent connections
- Demonstrates use of Java threading with sockets

---

## 🧪 How to Run

1. Open a terminal and navigate to the desired server directory:
   ```bash
   cd SingleThreadedServer   # or MultiThreadedServer
````

2. Compile the Java files:

   ```bash
   javac -d bin src/*.java
   ```

3. Run the server:

   ```bash
   java -cp bin MainClassName
   ```

   > Replace `MainClassName` with your actual main class name (e.g., `Server` or `Main`).

---

## 💡 Use Case

* Learning socket programming in Java
* Comparing blocking vs. concurrent server performance
* Building custom lightweight servers

---

## 🤝 Contributing

Pull requests are welcome. If you have improvements or new ideas (e.g., non-blocking or async server), feel free to fork and contribute!

---


Just update:
- `MainClassName` as per your actual file,
- and replace **[Your Name]** and **[@YourGitHubUsername]** with your details.

Want help creating a professional `LICENSE` file (MIT or another)?
```
