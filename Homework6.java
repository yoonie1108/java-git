public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
    public class course {
        protected String code;
        protected String name;
        public Course(String string);
        public String getCode();
        public String getName();
    }

    class OnlineCourse extends course {
        public OnlineCoure (String string);
        public String toString();
    }

    class OfflineCourse extends course {
        public OfflineCourse(String string);
        public String toString();
    }

}
