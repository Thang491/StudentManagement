/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

/**
 *
 * @author Zenos
 */
public class StudentNode {
    String name;
    String id;
    double gpa;
    String type;
    StudentNode pre, next;

    public StudentNode() {
    }

    public StudentNode(String name, String id, double gpa, String type, StudentNode pre, StudentNode next) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.type = type;
        this.pre = pre;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StudentNode getPre() {
        return pre;
    }

    public void setPre(StudentNode pre) {
        this.pre = pre;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    @Override
    public String toString() { 
        if(getGpa() < 5)
            setType("Yếu");
        else if(getGpa() >= 5 && getGpa() <= 6)
            setType("TB");
        else if(getGpa() > 6 && getGpa() < 8)
            setType("Khá");
        else
            setType("Giỏi");    
        return "StudentNode{" + "name=" + name + ", class=" + id + ", gpa=" + gpa + ", type=" + type + "}";
    }
    
    
}
