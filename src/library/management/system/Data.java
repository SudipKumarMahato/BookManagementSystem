/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author 1234s
 */
public class Data {

    public String bookID;

    public double price;
    public String quantity;
    public String bookname, author, category, firstname, lastname, radioButtonValue1;

    public Data(String bookID, String bookname, String author, double price, String quantity, String category, String firstname, String lastname, String radioButtonValue1) {
        this.bookID = bookID;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.firstname = firstname;
        this.lastname = lastname;
       
    }

   
}
