public class Sqrt {
    double delta;
    double arg;

    Sqrt(double arg, double delta) {
        this.arg = arg;
        this.delta = delta;
    }

    double average(double x, double y) {
        return (x + y) / 2.0;
    }

    boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }

    double improve(double guess, double x) {
        return average(guess,x / guess);
    }

    double iter(double guess, double x) {
        if(good(guess, x))
            return guess;
        else
            return iter(improve(guess, x), x);
    }

    public double calc() {
        return iter(1.0, arg);
    }

    public static void main(String[] args)
    {
        if (args.length < 2) {
            System.out.println("Insert value and accuracy!");
            return;
        }
        double val = Double.parseDouble(args[0]);
        double delta = Double.parseDouble(args[1]);
        Sqrt sqrt = new Sqrt(val, delta);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result + " with accuracy " + delta);
    }

}
