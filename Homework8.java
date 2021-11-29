import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Homework8 {
    public static void main(String[] args) {
     Map<String,String> login=new HashMap<>();

     login.put("myId","myPass");
     login.put("myId2","myPass2");
     login.put("myId3","myPass3");

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
