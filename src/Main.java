// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student("Mohammad","Alshibli");
       System.out.println(s2.toString());

       myDOB hiringdate = new myDOB(12,22,2024);

       Faculty Matt = new Faculty("Matt", "Rockwood", hiringdate,11223);
        System.out.println(Matt.toString());
        Faculty Matt2 = new Faculty("Matt", "Rockwood", hiringdate,11223);
        System.out.println(Matt2.toString());
    }
}