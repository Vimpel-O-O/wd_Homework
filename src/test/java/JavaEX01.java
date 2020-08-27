import org.testng.annotations.Test;

public class JavaEX01 {

    @Test
    public void test00001() {
        System.out.println("Hello, World!");
    }

    @Test
    public void test00002() {
        String message01 = "Hello, World!";

        System.out.println(message01);
    }

    @Test
    public void test00003() {
        int myNumber;
        myNumber = 5;

        System.out.println(myNumber);
    }

    @Test
    public void test0004() {
        int num = 5;
        String s = "I have " + num + " cookies";

        System.out.println(s);
    }

    @Test
    public void test0005() {
        boolean b = true;

        if (b == true) {
            System.out.println("B is true");
        }
    }

    @Test
    public void test0006() {
        boolean b = true;

        if (b) {
            System.out.println("B is true");
        }
    }

    @Test
    public void test0007() {
        int value1 = 1;
        int value2 = 1;

        if ((value1 == 1) && (value2 == 1)) {
            System.out.println("BOOM!");
        }
    }

    @Test
    public void test0008() {
        boolean b;

        boolean toBe = true;
        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }
    }


    @Test
    public void test0009() {
        boolean elementIsVisible = false;


        if (elementIsVisible) {
            System.out.println("CLICK on element");
        } else {
            System.out.println("Looking for another element");
        }
    }

    @Test
    public void test0010() {
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 2;
        array[3] = 4;

        int[] array2 = new int[]{17, 2, 53, 4, 5, 6, 47, 8, 39};

        System.out.println(array2[0]);

        System.out.println(array2[2]);

        int[] arr3 = {1, 2, 3, 4, 5};


    }

    @Test
    public void test00011() {

        for (int i = 2; i < 4; i++) {
            System.out.println("HELLO");
        }
    }

    @Test
    public void test00012() {
        int[] array = {1, 34, 5, 653, 737, 357357, 54};

        for (int i = 0; i < array.length - 2; i++) {
            System.out.println(array[i]);
        }
    }

    //TODO: print out message (ONLY) if not elements found
    @Test
    public void test00013() {
        int[] array = {1, 34, 5, 653, 737, 357357, 54};
        int valueToSearch = 2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                System.out.println("element value found:" + array[i]);
                System.out.println("index of the element is:" + i);
            }
        }
    }

    @Test
    public void test00014() {
        int[] array = {1, 34, 5, 653, 737, 357357, 54};
        searchForElement(array, 737);
    }

    @Test
    public void test00016() {
        int[] array = {1, 34, 5, 653, 737, 357357, 54};
        searchForElement(array, 33434);
    }


    public void searchForElement(int[] inputArray, int valueToSearch) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == valueToSearch) {
                System.out.println("element value found:" + inputArray[i]);
                System.out.println("index of the element is:" + i);
            }
        }
    }
}
