//Write a program that accepts the age of the user as input. When the age of the user is less than 19, a custom exception named InvalidAgeException is thrown. 
//Use exception handling mechanisms to handle this exception.
package com.daythree;
class InvalidAgeExcep extends Exception {
    InvalidAgeExcep(String s) {
        super(s);
    }
}
