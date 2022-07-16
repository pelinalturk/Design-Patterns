package com.designpatterns.creational.builder.builder1;

public class EmployeeWithBuilder {
    private final String firstName; //required
    private final String lastName; //required
    private final int age; //required
    private final int personalId; //required
    private final String phone; //optional
    private final String address; //optional
    private final String mail; //optional

    public static class EmployeeBuilder {
        private final String firstName; //required
        private final String lastName; //required
        private final int age; //required
        private final int personalId; //required
        private String phone; //optional
        private String address; //optional
        private String mail; //optional

        public EmployeeBuilder(String firstName, String lastName, int age, int personalId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalId = personalId;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public EmployeeWithBuilder build() {
            return new EmployeeWithBuilder(this);
        }
    }

    private EmployeeWithBuilder(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.personalId = builder.personalId;
        this.address = builder.address;
        this.mail = builder.mail;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "EmployeeWithBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personalId=" + personalId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
