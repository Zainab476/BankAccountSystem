# 🏦 Bank Account Management System

An object-oriented Java application built to demonstrate core structural concepts: **Abstraction**, **Inheritance**, **Encapsulation**, and **Polymorphism** by implementing dynamic `SavingsAccount` and `CurrentAccount` types.

---

## ✨ Features & OOP Concepts

* **Abstraction:** Features an abstract base class `BankAccount` containing concrete methods (`deposit`, `display`) alongside an abstract method `withdraw(double amount)`[cite: 7].
* **Inheritance:** `SavingsAccount` (enforces minimum balance rules) and `CurrentAccount` (no minimum balance) inherit core features using the `extends` keyword[cite: 7].
* **Encapsulation:** Keeps data secure by restricting state variables (`accountHolder`, `balance`) to `private` access with validated getter and deposit/withdraw methods[cite: 7].
* **Polymorphism:** Demonstrates runtime polymorphism by instantiating sub-classes via parent references (`BankAccount account = new SavingsAccount(...)`)[cite: 7].

---

## 🛠️ Tech Stack & Tools

* **Language:** Java (JDK 17 or higher)[cite: 6, 7]
* **Paradigm:** Object-Oriented Programming (Abstraction, Encapsulation, Polymorphism)[cite: 7]

---

## 📁 Class Structure

```text
src/
├── BankAccount.java     # Abstract parent class defining common account structure
├── SavingsAccount.java  # Subclass enforcing minimum balance validation
├── CurrentAccount.java  # Subclass for standard account operations
└── Main.java            # Test execution class utilizing polymorphic object creation
