/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** distributed VCS - configure local repository
 * s1: initializa versioning, .gitconfig, .gitignore, commit
 * @author willi
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student[] list = new Student[3]; //array of object declaration
        // code to print 3 student details
        // Object student
        Student s1 = new Student();  // define s1 name and age
        s1.setName("Peter");
        s1.setAge(21);
       Student s2 = new Student();
        s2.setName("Simran");
        s2.setAge(23);
        Student s3 = new Student();
        s3.setName("Oscar");
        s3.setAge(22);
        //array
        list[0]=s1; //stored objects in array
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+ " "+ list[i].getAge());
           
        }
    }
    
}
