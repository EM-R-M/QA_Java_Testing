public class Calculator {

    public int add(int x, int y){
        return x + y;
    }

    public int minus(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public Integer divide(int x, int y){
        if (x == 0 || y == 0) {
            return null;
        } else {
            return x / y;
        }
    }

}
