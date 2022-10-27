public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 122) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Указан некорректный возраст");
        }
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Добавьте имя или фамилию");
        }
        return new Person(name, surname, age, city);
    }
}
