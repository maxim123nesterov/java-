package dz1;

public class task2 {
 
    public static void main( String[] args ) {
 
        int i, j;
        boolean isprime;
 
        for ( i = 1; i < 100; i++ ) {
            isprime = true;
 
            for ( j = 2; j <= i / j; j++ ) {
                if ( ( i % j ) == 0 )
                    isprime = false;
            }
 
            if ( isprime )
                System.out.println( i + "-простое число" );
        }
 
    }
}