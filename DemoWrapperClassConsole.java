package lab13_wrapper_class_GUI.labWrapperClassGui;

public class DemoWrapperClassConsole {
    public static void main(String[] args)
    {
        DemoWrapperClass dwc = new DemoWrapperClass();

        System.out.println("Method minMax:\n");
        System.out.println(dwc.minMax());
        System.out.println("------------------------------------");

        System.out.println("\nMethod toBinary:\n");
        System.out.println(dwc.toBinary(15));
        System.out.println("------------------------------------");

        System.out.println("\nMethod charProperties:\n");
        System.out.println(dwc.charProperties('B'));
        System.out.println("------------------------------------");
       
    }

}
