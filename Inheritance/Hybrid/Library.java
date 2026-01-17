package Inheritance.Hybrid;

public class Library {
    void libraryName() {
        System.out.println("Collge Library");
    }
}

    class Section extends Library {
        void sectionName() {
            System.out.println("Reading Section");
        }

            public static void main(String[] args) {
                Books b = new Books();
                b.libraryName();
                b.sectionName();
                b.Type();
            }
        }


    class Books extends Section {
        void Type() {
            System.out.println("Books Section");
        }
    }

    class Newspaper extends Section {
        void language() {
            System.out.println("Different language NewsPaper available");
        }
    }


