package Inheritance.Hybrid;

public class Hospital {

        void hospitalName() {
            System.out.println("Sancheti Hospital");
        }

        public static void main(String[] args) {
            ICU i = new ICU();
            i.hospitalName();
            i.wardType();
            i.equipment();
        }
    }

    class HospitalRooms extends Hospital {
        void wardType() {
            System.out.println("Special Ward");
        }
    }

    class ICU extends HospitalRooms {
        void equipment() {
            System.out.println("ICU Equipment");
        }
    }

    class General extends HospitalRooms {
        void beds() {
            System.out.println("General beds");
        }
    }


