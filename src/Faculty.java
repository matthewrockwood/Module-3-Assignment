public class Faculty extends Person{
    private myDOB hiringDate = new myDOB(-1,-1,-1);
    private int facultyID;

    Faculty(){
        this.firstName = "";
        this.lastName = "";
        this.hiringDate = null;
        this.facultyID = -1;
    }
    Faculty(String firstName, String lastname, myDOB hiringDate, int facultyID){
        this.firstName = firstName;
        this.lastName = lastname;
        this.hiringDate = hiringDate;
        this.facultyID = facultyID;
    }
    public String toString(){
        return firstName+ " "  + lastName+ " "  + hiringDate.toString() + " " +  facultyID;
    }
}
