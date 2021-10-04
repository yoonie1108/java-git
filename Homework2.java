import java.util.Scanner;

public class Homework2 {
    private int snum;
    private String name;
    private String major;
    private int pnum;

    public int getSnum() {
        return snum;
    }
    public void setSnum(int snum) {
        this.snum = snum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public int getPnum() {
        return pnum;
    }
    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public static void main(String[] args) {
        Homework2 hh=new Homework2();
        Scanner sc=new Scanner(System.in);
        System.out.print("학생의 학번,이름,전공,전화번호를 입력하세요:");
        int snum=sc.nextInt();
        hh.setSnum(snum);
        String name=sc.nextLine();
        hh.setName(name);
        String major=sc.nextLine();
        hh.setMajor(major);
        int pnum=sc.nextInt();
        hh.setPnum(pnum);
        System.out.print("학생의 학번,이름,전공,전화번호를 입력하세요:");
        int snum=sc.nextInt();
        hh.setSnum(snum);
        String name=sc.nextLine();
        hh.setName(name);
        String major=sc.nextLine();
        hh.setMajor(major);
        int pnum=sc.nextInt();
        hh.setPnum(pnum);
        System.out.print("학생의 학번,이름,전공,전화번호를 입력하세요:");
        int snum=sc.nextInt();
        hh.setSnum(snum);
        String name=sc.nextLine();
        hh.setName(name);
        String major=sc.nextLine();
        hh.setMajor(major);
        int pnum=sc.nextInt();
        hh.setPnum(pnum);
        System.out.println("첫번쨰 학생:"+hh.snum()+hh.name()+hh.major()+hh.pnum());
        System.out.println("두번쨰 학생:"+hh.snum()+hh.name()+hh.major()+hh.pnum());
        System.out.println("세번쨰 학생:"+hh.snum()+hh.name()+hh.major()+hh.pnum());
    }
}

