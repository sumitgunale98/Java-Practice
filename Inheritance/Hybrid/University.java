package Inheritance.Hybrid;

public class University {

        void universityName() {
            System.out.println("State University");
        }

        public static void main(String[] args) {
            Commerce a = new Commerce();
            a.universityName();
            a.collegeName();
            a.subjects();
        }
    }

    class College extends University {
        void collegeName() {
            System.out.println("Modern College");
        }
    }



    class Science extends College {
        void lab() {
            System.out.println("Science Lab");
        }
    }
class Commerce extends College {
    void subjects() {
        System.out.println("Commerce Subjects");
    }
}


