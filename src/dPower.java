public class dPower {

    public static int power (int i, int n){
        if(n == 0){

            return 1;

        }
        return i*power(i,n-1);
    }
}
