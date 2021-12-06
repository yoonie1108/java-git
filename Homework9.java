import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class Homework9 {
   public void dbFile(String db,String charSet){
       try{
           FileInputStream a=new FileInputStream(db);
           InputStreamReader b=new InputStreamReader(a,charSet);
           BufferedReader br=new BufferedReader(b);
           String line;
           while(line=br.readLine())!=null;)
           System.out.println(line);
br.close();
       }
       catch (Exception e){e.printStackTrace();}
   }
    public static void main(String[] args) {
       Homework9 rf=new Homework9();
    System.out.println("db text file");
    rf.dbFile("db.txt","UTF8");
        Map<String,String> login=new HashMap<>();
        Scanner sc=new Scanner((new File("db.txt","UTF8")));
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id:");
            String id=sc.nextLine();
            id=id.trim();

            if(!login.containsKey(id)){
                System.out.print("입력하신 id는 존재하지않습니다. 다시 입력해주세요.");
            }
            else{
                System.out.print("password:");
                String pw=sc.next();
                pw=pw.trim();
                if(login.get(id).equals(pw)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    return;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다.다시 입력해주세요.");
                }
            }
        }
    }
}
