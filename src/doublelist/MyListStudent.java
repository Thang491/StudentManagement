/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

import GUI.MyCheck;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Zenos
 */
public class MyListStudent {

    StudentNode header;
    StudentNode trailer;
    int count = 0;

    public void addLast(String name, String id, double gpa, String type) {
        if (header == null) {
            header = trailer = new StudentNode(name, id, gpa, type, null, null);
        } else {
            StudentNode node = new StudentNode(name, id, gpa, type, trailer, null);
            trailer.next = node;
            trailer = node;
        }
    }

    public void addFirst(String name, String id, double gpa, String type) {
        if (header == null) {
            header = trailer = new StudentNode(name, id, gpa, type, null, null);
        } else {
            StudentNode node = new StudentNode(name, id, gpa, type, null, header);
            header.pre = node;
            header = node;
        }
    }
    
    boolean isEmpty() {
        return header == null;
    }
    

    public void traverse() {
        if (header == null) {
            System.out.println("Empty List");
        }
        StudentNode p = header;
        while (p != null) {
            System.out.println(" " + p.toString());
            p = p.next;
        }
        System.out.println("");
    }
    
    public void add(){
        int n = MyCheck.getAnInteger("The number of Student: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + (i+1) + "/" + n);
            String name;
            String id;
            double gpa;
            String type; 
            name = MyCheck.getStringName("Student name: ");
            id = MyCheck.getStringName("Student class: ");
            gpa = MyCheck.getAnDouble("Average: ");
            type = MyCheck.getStringName("Type: ");
            addFirst(name, id, gpa, type);          
        }
        count++;
    }
    
    public void showinfo(){
        for (int i = 0; i < count; i++) {
            traverse();
        }
    }
    
    public void countStudentInClass(){
        int dem = 0;
        StudentNode p = header;
        String className;
        className = MyCheck.getStringName("The name of class: ");
        while (p != null) {
            if(p.getId().equalsIgnoreCase(className))
            dem ++;
            p = p.next;           
        }
        System.out.println("Số sinh viên lớp đó là: " + dem);
    }
    
    public void typeClass(){
        StudentNode p = header;
        while(p != null){        
        if(p.getGpa() < 5)
            p.setType("Yếu");
        else if(p.getGpa() >= 5 && p.getGpa() <= 6)
            p.setType("TB");
        else if(p.getGpa() > 6 && p.getGpa() < 8)
            p.setType("Khá");
        else
            p.setType("Giỏi");     
        System.out.println(p.toString());
        p = p.next;
        }
    }
    
    
    public void listClass(){
        String className;
        StudentNode p = header;
        className = MyCheck.getStringName("The name of class: ");
        while (p != null) {
            if(p.getId().equalsIgnoreCase(className)){
            System.out.println(p.toString());
            p = p.next;           
            }          
        }
    }
    
    public void sortGpa() {
        for (StudentNode i = header; i != null; i = i.next) {
            for (StudentNode j = i.next; j != null; j = j.next) {
                if (i.gpa > j.gpa) {
                    double tmp = i.gpa;
                    i.gpa = j.gpa;
                    j.gpa = tmp;
                }
            }
        }
        traverse();
    }
    
}
