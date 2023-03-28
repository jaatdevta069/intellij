import java.io.*;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        try{
            String line;
            BufferedWriter wr = new BufferedWriter(new FileWriter("file.text"));
            BufferedWriter wr1 = new BufferedWriter(new FileWriter("file1.text"));
            wr.write("yahi to hai wo file");
            wr.write("\ngunnight guys ");
            wr.close();
            BufferedReader reader = new BufferedReader(new FileReader("file.text"));
            while((line= reader.readLine())!=null){
                wr1.write(line+'\n');
                System.out.print(line+"\n");
            }
            wr1.write("isme ye bhi add\nkro vro");
            wr1.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException e){
            e.printStackTrace();
        }
        String str = "hello";
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*i);
        String str1 =sc.next();
        if(str.equals(str1)) {
            System.out.println(1);
        }
        else
            System.out.println(0);

}}
