/**
 * Created by IvanD on 7/14/2017.
 */
public class Recursion {

    static int fact(int b)
    {
        if(b <= 1)
            //if the number is 1 then return 1
            return 1;
        else {
            //else call the same function with the value - 1
            int temp = fact(b - 1);
            return b * temp;
        }
    }

    public static void main(String[] args) {
        // F(2) - AB = 2
        // AB
        // BA

        // F(3) - ABC = 6
        // ABC
        // ACB
        // BAC
        // BCA
        // CAB
        // CBA

        System.out.println("Факторил от 2 = " + fact(2));
        System.out.println("Факторил от 3 = " + fact(3));
    }
}
