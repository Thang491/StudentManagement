/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

import GUI.MyCheck;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Doublelist {
    public static void main(String[] args) {
        MyListStudent list = new MyListStudent();
        int choice;
        
        do {            
            printMenu();
            choice = MyCheck.getAnInteger("Lựa chọn của bạn là: ");
            switch(choice){
                case 1: list.add();
                        break;
                case 2: list.countStudentInClass();
                        break;
                case 3: list.typeClass();
                        break;
                case 4: list.sortGpa();
                        break;
                case 5: list.listClass();
                        break;
                case 6: System.out.println("See you again !!!");
                        break;
            }
        } while (choice != 6);
        
    }
    
    public static void printMenu(){
        System.out.println("1. Tạo danh sách có N sinh viên");
        System.out.println("2. Đếm xem trong danh sách có bao nhiêu sinh viên học lớp X");
        System.out.println("3. Xếp loại học lực cho các sinh viên");
        System.out.println("4. Sắp xếp danh sách theo Điểm trung bình tăng dần");
        System.out.println("5. In ra màn hình danh sách sinh viên theo từng lớp");
        System.out.println("6. Thoát");
    }
}
