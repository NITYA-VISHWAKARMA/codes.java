import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class main{
    public static void main(String []args){
        try {
            File file = new File("index.html");
            if(file.createNewFile()){
                System.out.println("done ");
            }else{
                System.out.println("already file created");
            }

        } catch (Exception e) {
           System.out.println(e);
        }
    }

   


class Main {
    public static void main(String []args){
        createData();
        readFileData();
        // DeleteFile();
        try {
            File file = new File("home.html");
            if(file.createNewFile()){
                System.out.println("done" +file.getName());
            }else{
                System.out.println("already file created");
            }       
    }
        catch (Exception e) {
           System.out.println(e);
        }
    }
}



     static   void    createData(){
     try {
        FileWriter writer = new FileWriter("index.html" );
        writer.write("My name is Nitya Vishwakarma");
        writer.close();

     } catch (Exception e) {
        System.out.println(e);
     }
    }

static  void readFileData(){
    try {
        FileReader reader = new FileReader("index.html");
        int ch;
        while((ch=reader.read())!=-1){
            System.out.println((char)ch);

        }
    } catch (Exception e) {
       
    }
}

static void DeleteFile() {
    try {
        File file = new File("home.html");
        if(file.delete()){
            System.out.println("delete");
        }else{
            System.out.println("not delete");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
 }

    

