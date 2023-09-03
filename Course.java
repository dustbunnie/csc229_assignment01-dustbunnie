/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */


/**
 *
 * @author MoaathAlrajab
 */
public class Course {

    String name;
    String code;
    int ID;

    //Default Constructor
    public Course(){



    }
    //Overloaded constructor
    public Course(int ID, String code, String name){
        this.ID=ID;
        this.code=code;
        this.name=name;
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
