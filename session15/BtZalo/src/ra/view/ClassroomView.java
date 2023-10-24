package ra.view;

import ra.config.Config;
import ra.model.Classroom;
import ra.model.Student;
import ra.service.IClassroom;
import ra.service.IStudent;
import ra.service.impl.ClassroomServiceIMPL;
import ra.service.impl.StudentServiceIMPL;

import java.util.ArrayList;
import java.util.List;

public class ClassroomView {
    IClassroom  classroomsService = new ClassroomServiceIMPL();
    IStudent studentService = new StudentServiceIMPL();

    public void menu() {
        int choice;
        do {
            System.out.println("**********************CLASSROOM-MANAGEMENT************************");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7/8): ");
            choice = Config.validate();
            switch (choice) {
                case 1:
                    showListClassroom();
                    break;
                case 2:
                    addClassroom();
                    break;
                case 3:
                    editClassroom();
                    break;
                case 4:
                    deleteClassroom();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void deleteClassroom() {
        System.out.println("Nhập id lớp học cần xóa");
        int idDelete = Config.validate();
        List<Student> studentList = studentService.findAll();
        for (Student student : studentList ) {
            if (student.getClassrom().getClassroomId() == idDelete){
                System.out.println("Lớp học đã tồn tại sinh viên được xóa");
                return;
            }
        }
        boolean check = true;
        for (Classroom classroom : classroomsService.findAll()) {
            if (classroom.getClassroomId() == idDelete){
                classroomsService.deleteByid(idDelete);
                System.out.println("xóa lớp học thành công");
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Không tìm thấy id vừa nhập");
        }
    }

    private void editClassroom() {
        System.out.println("Mời nhập id lớp cần sửa thông tin");
        int inEdit = Config.validate();
        Classroom classroomEdit = classroomsService.findById(inEdit);
        if (classroomEdit == null) {
            System.out.println("không tìm thấy lớp theo ID vừa nhập");
        }else {
            System.out.println(classroomEdit);
            int choice;
            System.out.println("Mời chọn thông tin cần sửa ");
            System.out.println("1.Sửa tên");
            System.out.println("2.Sửa trạng thái");
            choice = Config.validate();
            switch (choice){
                case 1:
                    System.out.println("Nhập tên mới: ");
                    classroomEdit.setClassroomName(Config.scanner().nextLine());
                    break;
                case 2:
                    classroomEdit.setStatus(!classroomEdit.isStatus());
                    System.out.println("Đã thay đổi trạng thái");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ mời nhập lại");
            }
            classroomsService.update(classroomEdit);
        }
    }

    private void addClassroom(){
        System.out.println("Nhập số lượng lớp học cần thiết");
        int n = Config.validate();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập lớp thứ " +(i+1));
            Classroom newClassroom = new Classroom();
            System.out.println("Nhập tên lớp: ");
            newClassroom.setClassroomName(Config.scanner().nextLine());
            System.out.println("Nhập trạng thái lớp (true/false): ");
            newClassroom.setStatus(Boolean.parseBoolean(Config.scanner().nextLine()));
            classroomsService.save(newClassroom);
        }
    }

    private void showListClassroom() {
        System.out.println("DANH SÁCH CÁC LỚP HỌC");
        List <Classroom> classromList = classroomsService.findAll();
        for (Classroom classroom: classromList){
            System.out.println(classroom);
        }
    }
}
