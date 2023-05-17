public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Duman");
        cat.meow();
    }

    static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        void meow() {
            System.out.println(name + " : meow..");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}