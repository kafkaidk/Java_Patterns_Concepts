public class SingletonTest{
    public static void main (String[] args){
        Singleton logger1 = Singleton.getInstance();
        Singleton logger2 = Singleton.getInstance();

        logger1.log("hello froom logger 1");
        logger2.log("hello from logger 2");

        if (logger1 == logger2){
            System.out.println("both logger 1 and 2 are same instance");

        }
        else{
            System.out.println("different instances. singlwton patternn failed");
        }
    }
}