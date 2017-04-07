package functionalProgramming;

/**
 * Created by jjenkins on 4/7/2017.
 */
public class Called {

    public void invoke( Callable callable ) {
        callable.call( 5 );
    }
}
