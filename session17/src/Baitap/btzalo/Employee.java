package Baitap.btzalo;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    private int id;
    private String name;
    private boolean status;

    private List<Skill> skills;

    public Employee() {
    }

    public Employee(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Employee(int id, String name, boolean status, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skills=" + skills +
                '}';
    }
}
