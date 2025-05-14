package org.example.oops;

//✅ 2. Inheritance – Create specialized users
class Student extends User {
    public Student(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void showUserType() {
        System.out.println("Student Member: " + name);
    }
}

