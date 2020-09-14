/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticals;

/**
 *
 * @author Ayush
 */
public class E1Q4 {
    
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
class catalog{
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
class Faculty_member{
    String Fname, facultycoll;
    void checkoutbk(){};
}
class Student{
    String sName;
}
