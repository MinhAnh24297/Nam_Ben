package CMC.DAO;

import CMC.model.Student;

import java.io.*;

public class Connection {
    public void createStudent(Student student) {
        try {
            File writer = new File("C:\\Users\\admin\\Desktop\\testout.txt");
            if(!writer.exists()) {
                writer.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(writer, true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(student.toString() + '\n');

            buffer.close();
            
            System.out.println("Success...");}
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getStudent(){
        try {
            FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\testout.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            fr.close();
}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
