package com.github.perschola;
/*JavaBeans are classes that encapsulate many objects into a single object (the bean). It is a java class that should follow following conventions:

Must implement Serializable.
It should have a public no-arg constructor.
All properties in java bean must be private with public getters and setter methods.
*/

public class Message {

    private String Message;

    public Message(String msg){

        this.Message= msg;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String msg) {
        this.Message = msg;
    }
}
