public class Student {
   // Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    // Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }


    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemis..");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Gecti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.80) + (this.fizik.sozlu * 0.20)) + ((this.kimya.note * 0.80) + (this.kimya.sozlu * 0.20)) + ((this.mat.note * 0.80) + (this.mat.sozlu * 0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("************************");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note + " Matematik Sozlu Notu : " + this.mat.sozlu);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note + " Fizik Sozlu Notu : " + this.fizik.sozlu);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note + " Kimya Sozlu Notu : " + this.kimya.sozlu);
    }
}
