/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
public class LibraryManagementSystem {
    public static void main(String[] args) {
    }
    
}
class Librarian{
    String name, address;
    long mobileno;
    void Updateinfo(){}
    void Issuebooks(){}
    void memberInfo(){}
    void searchbk(){}
    void returnbk(){}
}
class catalog extends Books{
    String Authorname;
    int noofcopies;
    void Updateinfo(){}
    void searching(){}
}
class Books{
    String Nameofbook, AuthorName;
    int Noofbooks;
    void removefirmcatalog(){}
    void addtocatalog(){}
}
class Member{
    String Mname, Maddress;
    long Mno;
    void mrequestforbk(){}
    void Mreturnbk(){}    
}
class Faculty_member extends Member{
    String Fname, facultycoll;
    void checkoutbk(){};
}
class Student extends Member{
    String sName, Studentcoll;
    void checkoutbk(){};
    void returnbk(){};
}
class Alert extends Librarian{
    String Issuedate, Bookname, returndate;
    int Fine;
    void finecalc(){};
    void viewAlert(){};
    void sendtolibrarian(){};
    void deletealertbyno(){};
}
class general_book extends Books{
    
}
class reference_book extends Books{
    void searchrefbk(){};
}