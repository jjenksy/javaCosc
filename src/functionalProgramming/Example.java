package functionalProgramming;

/**
 * Created by jjenkins on 4/7/2017.
 */
public class Example implements Callable {
        public void call(int param) {
            System.out.println( param );
        }



        public static void main(String[] args){
            Callable cmd = new Example();
            Called called = new Called();

            called.invoke(cmd);
        }

}
