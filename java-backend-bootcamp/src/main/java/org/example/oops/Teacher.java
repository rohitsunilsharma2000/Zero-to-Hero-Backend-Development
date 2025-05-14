package org.example.oops;
//✅ 2. Inheritance – Create specialized users
class Teacher extends User {
    public Teacher ( String name , String memberId ) {
        super(name , memberId);
    }

    @Override
    public void showUserType () {
        System.out.println("Teacher Member: " + name);
    }
}
