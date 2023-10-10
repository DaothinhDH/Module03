package Thuchanh.Thuchanh1;

import Thuchanh.Thuchanh1.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meo meo";
    }
}
