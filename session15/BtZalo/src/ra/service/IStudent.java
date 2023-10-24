package ra.service;

import ra.model.Student;

import java.util.List;

public interface IStudent extends IGeneric<Student> {
    List<Student> findByName(String name);
}
