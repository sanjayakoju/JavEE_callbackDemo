import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Student;

public class Main {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("lab5");
    public static EntityManager em = emf.createEntityManager();
    public static EntityTransaction transaction = em.getTransaction();
    public static void main(String[] args) {
        System.out.println("App Start");

        createStudent();

//        updateStudent();

//        removeStudent();

        System.out.println("App Stop");
    }

    private static void createStudent() {
        transaction.begin();
        Student student1 = new Student();
        student1.setName("Sanjaya");
        em.persist(student1);

        transaction.commit();
    }

    private static void updateStudent() {
        transaction.begin();
        Student student = em.find(Student.class, 3L);
        student.setName("Sunil");
        transaction.commit();
    }

    private static void removeStudent() {
        transaction.begin();
        Student student = em.find(Student.class, 3L);
        em.remove(student);
        transaction.commit();
    }
}
