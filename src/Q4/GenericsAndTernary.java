package Q4;

public class GenericsAndTernary {
    // generic typing
    static class myBox<T> { //define a templaye type "T"
        private T myVal;

        public myBox(T thing) {
            myVal = thing;
        }

        public void setVal(T thing) {
            myVal = thing;
        }

        public T getVal() {
            return myVal;
        }

        public String toString() {
            return myVal.toString();
        }
    }

    static <T> void printBox(myBox<T> box) {
        if (box != null && box.getVal() instanceof Integer)
            System.out.println("Box Number: " + box.getVal());
        System.out.println("Box contains: " + box);
    }

    public static void main(String[] args) {
        var box = new myBox<Integer>(5);
        // ONLY USE VAR IF YOU USE THE new KEYWORD
        // AND THE TYPE IS NOT A CHILD CLASS OR USES AN INTERFACE

        String msg = (box.getVal() >= 5) ? "val >= 5" : "val <= 5";
        // ?: Ternary Operator -> (contition) "if" ... "else"
        System.out.println(msg);

        int num = Integer.parseInt("10");
        System.out.println(box.getVal());
        // Cant do dynamic typing

        var sBox = new myBox<String>("Hello");
        System.out.println(sBox);

        int x = 100;
        do {
            System.out.println("X = " + x);
        } while (x < 5);

        for (int i = 0; i < 1_000_000; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }

        int day = switch (3) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
        };

        enum Days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY
        }

        var today = Days.WEDNESDAY;
        switch (today) {
            case WEDNESDAY -> System.out.println("It is wednesday");
            default -> System.out.println("It is not wednesday");
        }
    }


}
