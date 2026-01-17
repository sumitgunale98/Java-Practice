package Inheritance.Hybrid;

public class Education {

        void degree() {
            System.out.println("Engineering");
        }
    }

    class Course extends Education {
        void duration() {
            System.out.println("4 years");
        }
    }

    class Java extends Course {
        public static void main(String[] args) {
            Java j = new Java();
            j.degree();
            j.duration();
            System.out.println("Java Course");
        }
    }

    class Python extends Course {
        void level() {
            System.out.println("Beginner level");
        }
    }


