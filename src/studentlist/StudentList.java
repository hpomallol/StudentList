/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;
//import java.util.Scanner;
/**
 *
 * @author paul
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Harold","totaso");
        //Scanner input = new Scanner(System.in);
        System.out.println("Student 1's name is: " + s1.getsName() + " with studient ID: " + s1.getsID());
        
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("Mama","Guebo");
        studentList[2] = new Student("Elma","Singon");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println("Student name is: " + studentList[i].getsName() + " ID: " + studentList[i].getsID());
        }
                
        
        
        
    }
    
}
