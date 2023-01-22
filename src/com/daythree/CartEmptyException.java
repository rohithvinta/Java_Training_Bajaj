//Write  program to accept records of Item (itemId,name,price) from user and store into ArrayList.
//If ArrayList is empty throw user defined CartEmptyException else display records from arraylist as cart

package com.daythree;

import java.util.*;

class CartEmptyException extends Exception {
    CartEmptyException(String s) {
        super(s);
    }
}