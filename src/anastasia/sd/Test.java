package anastasia.sd;

import com.company.Program;

import java.io.IOException;

/**
 * Created by IT PROSTIR on 13.03.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        forDemo();
    }

    public static void readParse() throws IOException {
        System.out.print("Введите строку: ");
        String s = Program.stdIn.readLine();
        double f;
        try {
            f = Double.parseDouble(s);
            System.out.print("Вы ввели число: " + f);
        } catch (NumberFormatException e) {
            System.out.print("Вы ввели не число");

        }
    }



    public static void loop() {
        int a=5;
        int b=9;
        int i=0;

        while(i<10) {
            System.out.format(" i=%s\n %s привет\n %s", i,a,b);
            i=i+1;
            a=a-2;
            b=b+22;
        }
        System.out.println("end of while");
    }
    public static void array(){
        String[] strList;
        strList=new String[100];
        String[] strList2;
        strList2=null;
        strList[10]= "привет";
        System.out.println(strList[10]);
        strList2=strList;
        System.out.println(strList2[10]);
        strList2[35]="hello";
        System.out.println(strList[35]);


    }
    public static void stringConcat() throws IOException {
        String t;
        t="";
        while(true) {

            System.out.print("Введите строку:");
            String f=Program.stdIn.readLine();
            t=t+f;
            boolean b=f.length()==0;
            if(b) {
                break;
            }
        }
        System.out.print(t);
    }

    public static void stringArray()  throws IOException {
        String[] strList=new String[100];
        String k;
        int i=0;
        while(true){
           System.out.format("Введите строку №%s: ", i+1);
            k = Program.stdIn.readLine();
            if(k.length()==0) break;
            strList[i]=k;
            i=i+1;


        }
        System.out.print("Введите № строки:");
        k = Program.stdIn.readLine();
        int t;
        t= Integer.parseInt(k);
        t=t-1;
        System.out.println(strList[t]);



    }
    static void splitDemo() throws IOException {
        System.out.println("Введите строку: ");
    }

    static void whileDemo(){
        int a=1;

        while(a<10){
            System.out.println(a+"Hello");
            a=a+1;
        }
    }

    static void forDemo(){
        for(int a=1; a<11; a++){
            System.out.println(a+" Hello ");
        }

    }
    static void doWhileDemo(){
        int a=1;
        do{
            System.out.println(a+" Hello ");
        }
    }


}
