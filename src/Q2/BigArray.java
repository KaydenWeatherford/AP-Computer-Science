package Q2;

public class BigArray {
    public static void main(String[] args) {

        // Get a mf array of nums
        //-------------------------------------------------
        int[] array = new int[19];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (91 - 20) + 20); // :3
        }
        //-------------------------------------------------

        // Print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // For-Each loop
        for (int temp : array) // For Every int
        {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Middle Number
        System.out.println("The middle number is: " + array[array.length / 2]);

        // Average of the first, middle, and last
        double avg = array[0] + array[array.length / 2] + array[array.length - 1];
        System.out.println("Average of F,M,and Last number is: " + avg / 3);

        // Find the Largest and Smallest number in the Array
        int smallest = array[0];
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The biggest number is: " + biggest);

        // Switch the largest with the smallest number
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == biggest) largeIndex = i;
        }

        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // New Rand from 1-10 inserted into middle
        int randNum = (int) (Math.random() * (11 - 1) + 1);
        array[array.length / 2] = randNum;
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Add 10 to every num
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        for (int x : array) System.out.print(x + " ");
        System.out.println();

        // Replace the third element in the array with 5 and print the number outed
        int myThird = array[2];
        array[2] = 5;
        System.out.println("Outed num: " + myThird);

        // Check numbers that are bigger than 50
        for (int num : array) {
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        }

        // What numbers are multiples of 4?

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // Is there a 60?
        boolean sixty = false;
        for (int num : array)
            if (num == 60)
                sixty = true;
        System.out.println("Is 60 in the list: " + sixty);


        // Are they in the same order front to back, back to front?
        boolean same = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[(array.length - 1) - i])
                same = false;
        }
        System.out.println("Is the array palindromic: " + same);

        // How many numbers are greater than average?
        double average = 0;
        for (int x : array) average += x;
        average /= array.length;

        int avgcnt = 0;
        for (int x : array)
            if (x > average)
                avgcnt++;
        System.out.println(avgcnt + " Numbers are greater than average.");

        // How many numbers are even?
        int evencnt = 0;
        for (int x : array)
            if (x % 2 == 0)
                evencnt++;
        System.out.printf("There are %d even numbers in the list.\n", evencnt);

        // Copy all of the elements of the array into a new array but in reverse order.
        int[] newarray = new int[array.length];
        int i2 = 0;
        for (int i = array.length - 1; i > 0; i--) {
            newarray[i2] = array[i];
            System.out.print(newarray[i2] + " ");
            i2++;
        }
        System.out.println();

        // Shift every number to the right
        int[] shiftarr = circularshiftright(array);
        for (int x : shiftarr)
            System.out.print(x + " ");
        System.out.println();

        // Find the sum all the digits
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;

        }
        System.out.println("The sum of all digits of all elements: " + sum);
    }

    public static int[] circularshiftright(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            shifted[i] = arr[i - 1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
