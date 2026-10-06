package com.codealpha.aichatbot;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChatController {

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {

        String message = request.get("message");

        String response = getBotResponse(message);

        Map<String, String> result = new HashMap<>();
        result.put("response", response);

        return result;
    }

    private String getBotResponse(String message) {

    String text = message.toLowerCase().trim();

    // Basic NLP preprocessing
    text = text.replaceAll("[^a-z0-9 ]", " ");
    text = text.replaceAll("\\s+", " ");

    // Greetings
    if (text.equals("hello") ||
    text.equals("hi") ||
    text.equals("hey") ||
    text.contains("good morning") ||
    text.contains("good evening")) {

        return "Hello! 👋 I'm your Java-powered AI Chatbot. How can I help you?";
    }

    // Java
    if (text.contains("java") ||
        text.contains("programming language")) {

        return "Java is a high-level, object-oriented programming language known for portability, reliability and wide use in software development.";
    }

    // OOP
    if (text.contains("oop") ||
        text.contains("object oriented programming")) {

        return "OOP stands for Object-Oriented Programming. Its four main concepts are Encapsulation, Inheritance, Polymorphism and Abstraction.";
    }

    // Class
    if (text.contains("class")) {

        return "A class is a blueprint for creating objects. It defines the properties and behaviors that objects can have.";
    }

    // Object
    if (text.contains("object")) {

        return "An object is an instance of a class. It represents an entity with data and behavior.";
    }

    // Inheritance
    if (text.contains("inheritance") ||
        text.contains("extends keyword")) {

        return "Inheritance allows one class to acquire the properties and methods of another class. In Java, it is commonly implemented using the extends keyword.";
    }

    // Polymorphism
    if (text.contains("polymorphism")) {

        return "Polymorphism means one interface or method can have different forms. Method overloading and method overriding are common examples in Java.";
    }

    // Encapsulation
    if (text.contains("encapsulation")) {

        return "Encapsulation means wrapping data and methods together inside a class and controlling access to the data using access modifiers.";
    }

    // Abstraction
    if (text.contains("abstraction")) {

        return "Abstraction means hiding implementation details and showing only the essential features. Java supports abstraction using abstract classes and interfaces.";
    }

    // Array
    if (text.contains("array")) {

        return "An array is a data structure used to store multiple values of the same data type in a fixed-size collection.";
    }

    // AI
    if (text.contains("artificial intelligence") ||
    text.equals("ai") ||
    text.contains("what is ai")) {

        return "Artificial Intelligence, or AI, is the field of creating systems that can perform tasks that normally require human intelligence, such as learning, reasoning and decision-making.";
    }

    // Machine Learning
    if (text.contains("machine learning") ||
        text.equals("ml")) {

        return "Machine Learning is a branch of AI where computers learn patterns from data and use those patterns to make predictions or decisions.";
    }

    // NLP
    if (text.contains("nlp") ||
        text.contains("natural language processing")) {

        return "NLP stands for Natural Language Processing. It enables computers to understand, process and respond to human language.";
    }

    // Features
    if (text.contains("feature") ||
        text.contains("features")) {

        return "My features include Java-based rule processing, NLP-style text processing, programming FAQs, real-time chat, quick questions and a responsive web interface.";
    }

    // Help
    if (text.contains("help") ||
        text.contains("what can you do")) {

        return "I can answer questions about Java, OOP, inheritance, polymorphism, arrays, Artificial Intelligence, Machine Learning and NLP.";
    }

    // Thanks
    if (text.contains("thank") ||
        text.contains("thanks")) {

        return "You're welcome! 😊 I'm always happy to help.";
    }

    // Goodbye
    if (text.contains("bye") ||
        text.contains("goodbye")) {

        return "Goodbye! 👋 Have a great day and keep learning!";
    }

    // Fallback
    return "I'm still learning. Try asking me about Java, OOP, inheritance, polymorphism, arrays, AI, Machine Learning or NLP.";
}
}