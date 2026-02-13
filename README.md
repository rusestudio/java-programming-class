# Java Programming Class Repository

This repository contains Java programming exercises, labs, and assignments from the 2024-1 Java Programming Lab course. It includes a collection of Java code examples covering fundamental and intermediate concepts, as well as a web-based code viewer and runner for interactive testing.

## Features

### Java Code Collection
- **Comprehensive Labs**: Organized by weeks, covering topics like OOP, file I/O, GUI, exception handling, generics, collections, and more.
- **Sample Code**: Includes examples for ATM simulations, order management, math utilities, and various algorithms.
- **Mixed Languages**: Some code in Korean and English, reflecting diverse student contributions.

### Web App (Code Viewer & Runner)
- **Browse Files**: View all Java files in the repository via a web interface.
- **Code Display**: Syntax-highlighted code viewer.
- **Run Code**: Compile and execute selected Java code online (requires JDK on the server).
- **Copy Code**: Easily copy code snippets to clipboard.

## Installation & Setup

### Prerequisites
- **JDK**: Java Development Kit (version 8 or higher) installed for running/compiling Java code.
- **Node.js**: For the web app backend (version 14 or higher).

### Running the Web App
1. Clone the repository:
   ```
   git clone <repository-url>
   cd java-programming-class
   ```

2. Navigate to the web app directory:
   ```
   cd web-app
   ```

3. Install dependencies:
   ```
   npm install
   ```

4. Start the server:
   ```
   npm start
   ```

5. Open your browser and go to `http://localhost:3000`.

### Running Java Code Locally
- Ensure JDK is installed.
- Compile: `javac <filename>.java`
- Run: `java <classname>`

## Usage

- **Web App**: Select a Java file from the list, view the code, and click "Run Code" to see output. Use "Copy Code" to copy snippets.
- **Local Development**: Use the code files for learning and practice. Each folder contains exercises for specific topics.

## Repository Structure

```
java-programming-class/
├── 1-1/                    # Semester 1 labs (weeks 1-14)
├── 1-2/                    # Semester 2 labs and gathered examples
├── imgs/                   # Images used in labs
├── lab-gather/             # Collected lab exercises by topic
├── web-app/                # Web application for code viewing
│   ├── public/             # Frontend files (HTML, CSS, JS)
│   ├── server.js           # Backend server
│   └── package.json        # Node.js dependencies
└── README.md               # This file
```

## Contributing

This is an educational repository. If you're a student or instructor, feel free to add more examples or improve the web app.

## License

This project is for educational purposes. Please respect copyright and academic integrity.
