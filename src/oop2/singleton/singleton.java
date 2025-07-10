package oop2.singleton;

public class singleton {
    singleton obj = new singleton();


    private singleton instance;

    public singleton getInstance(){

        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
