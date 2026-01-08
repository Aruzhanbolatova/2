Pet Adoption Platform 🐾
Project Overview

This project is a Pet Adoption Platform developed in Java as part of Assignment 2 for the Object-Oriented Programming course.

The main goal of the project is to demonstrate the correct application of Object-Oriented Programming (OOP) principles through a simple and clear domain model.

OOP Concepts Used

In this project, I implemented the following OOP principles:

Abstraction – using abstract classes to define common behavior

Encapsulation – using private fields with getters and setters

Inheritance – creating child classes from parent classes

Polymorphism – overriding methods and using parent references

Project Structure

The project consists of the following classes:

Animal – abstract parent class for animals

Dog, Cat – child classes that extend Animal

Pet – represents a pet available for adoption

Person – abstract parent class for people

Adopter – child class that extends Person

Shelter – manages pets and adopters (data pool)

Main – demonstrates how the system works

All classes are located in the src folder.

Class Responsibilities
Animal (abstract)

Stores common animal information

Declares the abstract method makeSound()

Dog / Cat

Extend Animal

Override makeSound() to demonstrate polymorphism

Pet

Represents a real pet in the shelter

Contains pet details and an Animal reference

Overrides toString(), equals(), and hashCode()

Person (abstract)

Stores common information about people

Adopter

Extends Person

Represents a person who adopts pets

Shelter

Acts as the core class of the system

Stores a data pool of pets and adopters

Provides:

searching (by id, by name)

filtering (available pets, by species)

sorting (by age, by name)

adoption logic

Main

Creates objects and tests system functionality

Data Pool, Searching, Filtering, and Sorting

The Shelter class organizes data using:

List<Pet> for storing pets

List<Adopter> for storing adopters

Implemented operations:

Search pet by ID

Search pets by name

Filter available pets

Filter pets by species

Sort pets by age

Sort pets by name

How to Run

Open the project in any Java IDE (IntelliJ IDEA, Eclipse, etc.)

Make sure all files are inside the src folder

Run the Main class

Conclusion

This project demonstrates a clean and structured implementation of object-oriented programming concepts in Java. The code is easy to read, extend, and maintain, and fully meets the requirements of Assignment 2.

Author: Aruzhan Bolatova
Group: SE-2501
