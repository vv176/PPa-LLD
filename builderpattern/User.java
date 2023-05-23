package designpatterns.builderpattern;

public class User {

    private final int id;
    private final String name;
    private final String phoneNumber; // optional
    private final int age; // optional


    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public static class Builder {
        private final int id;
        private final String name;
        private String phoneNumber; // optional
        private int age; // optional

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
            this.phoneNumber = "";
            this.age = 0;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder age(int age) {
            if (age < 0)
                throw new IllegalArgumentException("Age must not be -ve");
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}




