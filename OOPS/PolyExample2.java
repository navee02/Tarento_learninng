class A {

    int Multiply(int a, int b) {

        return a * b;
    }

    int Multiply(int a, int b, int c) {

        return a * b * c;
    }
}

class PolyExample2 {

    public static void main(String[] args) {

        A x = new A();
        System.out.println(x.Multiply(2, 4));
        System.out.println(x.Multiply(2, 7, 3));
    }
}
