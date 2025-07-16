public class Singleton{
    public static Singleton instance;
    private Singleton(){
        System.out.println("Singleton instance created.");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("LOG: " + message);
    }
}