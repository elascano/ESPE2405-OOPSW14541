package Guardar_Pollito;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
public class GuardarPollito {
    File pollito;
    Scanner in=new Scanner(System.in);
    String text="";
    int id=0,numerito=0;
    String name="",color="";
    boolean molting=false;
    float age=0;
    int num1=0;
    private void createFile(){
        pollito = new File("pollito.txt");
        try {
            if (pollito.createNewFile()) {
                System.out.println("File created successfully");
            }
            else{
                System.out.println("!!Error!!");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }
    private void deleteFile(){
        if (pollito.delete()) {
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("!!Error!!");
        }
    }
    private void writeToFile(){
        try {
            FileWriter write =new FileWriter(pollito,true);
                System.out.print("Id:\t");
                id=in.nextInt();
                in.nextLine();
                System.out.print("Name:\t");
                name=in.nextLine();
                System.out.print("Color:\t");
                color=in.nextLine();
                System.out.print("Age:\t");
                age=in.nextFloat();
                System.out.println("Is molting?\n1.-Yes\t\tOther Number.-No");
                numerito=in.nextInt();
                switch (numerito) {
                    case 1:
                        molting=true;
                    break;
                    case 2:
                        molting=false;
                    break;
                    default:
                        molting=false;
                    break;}
                write.write(id+"\t"+name+"\t"+color+"\t"+age+"\t"+molting+"\n");
                write.close();
            System.out.println("Text added successfully");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    private void readFile(){
        String readed="";
        try {
            FileReader reader=new FileReader(pollito);
            BufferedReader reading =new BufferedReader(reader);
            while (readed!=null) {
                readed= reading.readLine();
                System.out.println(readed);
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    public static void main(String[] args) {
        Scanner in2=new Scanner(System.in);
        int num2=0;
        GuardarPollito archivo=new GuardarPollito();
        archivo.createFile();
        do{
            archivo.writeToFile();
            System.out.println("Do you want to continue writing?\n1.- No\t\tother number.- yes");
            num2=in2.nextInt();
        }while(num2!=1);  
        archivo.readFile();    
    }
}