package Inheritance.Hybrid;

public class BuildingNew {

        void base() {
            System.out.println("Base ready");
        }

        public static void main(String[] args) {
            Office o = new Office();
            o.base();
            o.level();
            o.officeType();
        }
    }

    class Floor extends BuildingNew {
        void level() {
            System.out.println("Floor level");
        }
    }

    class Office extends Floor {
        void officeType() {
            System.out.println("Office");
        }
    }

    class Room extends Floor {
        void type() {
            System.out.println("Room");
        }
    }


