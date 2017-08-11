package signupformmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Faisal
 */
public class User {
    
    /*public User(){
        //ArrayList<String> arr = new ArrayList<String>();
        
        try {
            
            FileReader reader = new FileReader("database.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            String info[];
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                arr.add(info[0]);
                arr.add(info[1]);
                arr.add(info[2]);
                arr.add(info[3]);
                
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        //for(String str: arr)
            //System.out.println(str);
            for(String str: arr)
                System.out.println(str);

    }*/
    String name;
    String email;
    String gender;
    String doB;
    public User(String name, String email, String gender, String doB){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.doB = doB;
    }
    /*public ArrayList ListUsers(){
        try {
            ArrayList<User> arr = new ArrayList<User>();
            FileReader reader = new FileReader("database.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            String info[];
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                User u1 = new User(info[0]);
                
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        //for(String str: arr)
            //System.out.println(str);
            for(String str: arr)
                System.out.println(str);

    }
    }*/
    
}
