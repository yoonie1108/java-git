import java.turnon.PersonalComputer
public class Homework5{

    class PersonalComputer {
        private Computer computer;
        private Monitor monitor;
        PersonalComputer(Computer computer,Monitor monitor){
            this.computer =computer;
            this.monitor=monitor;
        }
        public String toString(){
            return System.out.println("Turning on the computer");
            System.out.println("Turning on the monitor");
        }
    }
    class Monitor {
        private Computer computer;
        private Monitor monitor;
        PersonalComputer(Computer computer, Monitor monitor){
            this.computer =computer;
            this.monitor=monitor;
        }
        public String toString(){
            return System.out.println("Turning on the computer");
            System.out.println("Turning on the monitor");
        }
    }
    public class Computer {
        private String cpu;
        private String memory;
        private String hd;
        private String color;
        private String power;

        public String getCpu(){
            return cpu;
        }
        public String getMemory(){
            return memory;
        }
        public String getHd(){
            return hd;
        }
        public String getColor(){
            return color;
        }
        public String getPower(){
            return power;
        }
        public String toString(){
            return "Cpu"+cpu.toString()+"\nMemory;"+memory.toString()+"\nHDD"+hd.toString()+"\nColor"+color.toString()+"\npower"+power.toString();
        }
    }
    public static void main(String[] args){
        PersonalComputer printInfo = new PersonalComputer(
                new Monitor("24 inch"+"Black"+"45w");
        new Computer("Core i7"+"16GB"+"2TB"+"White"+"500W"));
        System.out.println(printInfo);
    }
}
