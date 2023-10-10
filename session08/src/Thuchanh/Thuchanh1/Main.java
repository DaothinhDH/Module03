package Thuchanh.Thuchanh1;

import Thuchanh.Thuchanh1.Animal;
import Thuchanh.Thuchanh1.Cat;
import Thuchanh.Thuchanh1.Dog;

public class Main {
    public static void main(String[] args) {
        // tạo đối tượng từ các lớp
        Animal animal1 = new Animal("pig");
        Dog dog1 = new Dog("Becgie","black");
        Dog dog2 = new Dog("pug","yellow");
        Cat cat = new Cat("Dora");
        // dùng các phương thức getter and setter truy cập và thay đổi thuộc tính
        System.out.println("Tên động vật: "+animal1.getName());
        animal1.setName("Bird");
        System.out.println("Tên động vật: " + animal1.getName());
        // truy cập phương thức từ lớp cha
        dog1.setName("corgi");
        System.out.println("Tên: "+ dog1.getName());
        System.out.println("Tiếng kêu: "+ dog1.makeSound());
        System.out.println("Màu sắc: " + dog2.getColor());
        System.out.println("Tiếng kêu: " + dog2.makeSound());
        System.out.println("Tên: " + cat.getName());
        System.out.println("Tiếng kêu: " + cat.makeSound());




    }
}
