public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Натальи")
                .setSurname("Алмаз")
                .setAge(33)
                .setCity("Санкт-Петербург")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Дмитрий")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}
