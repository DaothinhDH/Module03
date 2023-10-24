package ra.service.impl;

import ra.model.Classroom;
import ra.service.IClassroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomServiceIMPL implements IClassroom {
    static List<Classroom> classromsList = new ArrayList<>();
    @Override
    public List<Classroom> findAll() {
        return classromsList;
    }

    @Override
    public void save(Classroom classrom) {
        classromsList.add(classrom);
    }

    @Override
    public void update(Classroom classrom) {
        Classroom classroomEdit = findById(classrom.getClassroomId());
        classroomEdit.setClassroomName(classrom.getClassroomName());
        classroomEdit.setStatus(classrom.isStatus());
    }

    @Override
    public void deleteByid(int id) {
       Classroom classroomDelete = findById(id);
       classromsList.remove(classroomDelete);
    }

    @Override
    public Classroom findById(int id) {
        for (Classroom classroom : classromsList) {
            if (classroom.getClassroomId() == id) {
                return classroom;
            }
        }
        return null;
    }
}
