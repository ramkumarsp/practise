package com.designPatterns.singleton;

public class MySingleton implements Cloneable{

//    private final volatile MySingleton mySingleton;
    private static MySingleton mySingleton;

    //eager loading
    static {
        mySingleton = new MySingleton();
    }

    private MySingleton() {
    }

    //Lazy loading
    public static MySingleton getInstance() {

        if (mySingleton == null) {
            //multi threading
            synchronized (MySingleton.class) {
                if(mySingleton == null) {
                    mySingleton = new MySingleton();
                }
            }
        }

        return mySingleton;
    }

    //singleton clonable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return mySingleton;
    }

    //singleton clonable
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException();
//    }
}
