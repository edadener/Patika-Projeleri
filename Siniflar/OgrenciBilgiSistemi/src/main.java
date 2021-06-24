public class main {
    public static void main(String[] args) {

    Course mat = new Course("Matematik", "MAT101", "MAT");
    Course fizik = new Course("Fizik", "FZK102", "FZK");
    Course kimya = new Course("Kimya", "KMY103", "KMY");

    Teacher t1 = new Teacher("Eda", "555", "MAT");
    Teacher t2 = new Teacher("Seda", "777", "FZK");
    Teacher t3 = new Teacher("Meda", "333", "KMY");

    mat.addTeacher(t1);
    fizik.addTeacher(t2);
    kimya.addTeacher(t3);

    Student s1 = new Student("Alex", 4, "161103007", mat, fizik, kimya);
    s1.addBulkExamNote(100,100,100);
    s1.addBulkSozluNote(100, 100, 100);
    s1.isPass();

    Student s2 = new Student("De", 4, "187349200", mat, fizik, kimya);
    s2.addBulkExamNote(100,90,80);
    s2.addBulkSozluNote(100, 100, 100);
    s2.isPass();

    Student s3 = new Student("Souza", 4, "172502502", mat, fizik, kimya);
    s3.addBulkExamNote(100,70,40);
    s3.addBulkSozluNote(100, 100, 100);
    s3.isPass();

}
}