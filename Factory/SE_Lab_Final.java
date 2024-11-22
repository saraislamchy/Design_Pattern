/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.se_lab_final;

interface OS {
    String show();
}

class Android implements OS{
    public String show(){
    return "This is Android";
    }
}
class IOS implements OS{
    public String show(){
    return "This is IOS";
    }
}
interface Maker{
    OS makeOS();
}
class AndroidMaker implements Maker{
    public OS makeOS(){
        return new Android();
    }
}
class IOSMaker implements Maker{
    public OS makeOS(){
        return new IOS();
    }
}
    class Factory{
        public OS getOS(String name){
            Maker maker;
            if(name == "Android")
            {
                maker = new AndroidMaker();
            }
            else
            {
                maker = new IOSMaker();
            }
            return maker.makeOS();
        }
        
    }




public class SE_Lab_Final {

    public static void main(String[] args) {
        Factory f1 = new Factory();
        OS os = f1.getOS("Android");
        System.out.println(os.show());
    }
}
