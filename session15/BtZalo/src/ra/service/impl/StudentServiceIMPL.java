package ra.service.impl;

import ra.model.Student;
import ra.service.IStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudent {
    static List<Student> studentList = new ArrayList<>();
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {
        Student studentEdit = findById(student.getStudentId());
        studentEdit.setStudentName(student.getStudentName());
        studentEdit.setClassrom(student.getClassrom());
        studentEdit.setAddress(student.getAddress());
        studentEdit.setPhone(student.getPhone());


    }

    @Override
    public void deleteByid(int id) {
        

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
