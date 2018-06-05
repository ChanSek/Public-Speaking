public class MethodOverload {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public void testAdd() {
        add(10, 20);
        add(10, 20, 30);
    }
}
