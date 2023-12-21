package javaBasic;

public class InterfaceCallback {
    public static void main(String[] args) {
        TvButton tvButton = new TvButton(new EventHandler(){

            private boolean on = false;

            public void execute(){

                if(on) {
                    System.out.println("Телевизор выключен..");
                    on=false;
                }
                else {
                    System.out.println("Телевизор включен!");
                    on=true;
                }
            }
        });

        TvButton printButton = new TvButton(new EventHandler(){

            public void execute(){

                System.out.println("Запущена печать на принтере...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}

interface EventHandler{

    void execute();
}

class TvButton{

    EventHandler handler;
    TvButton(EventHandler action){

        this.handler=action;
    }
    public void click(){

        handler.execute();
    }
}
