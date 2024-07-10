import jakarta.persistence.*;
import jakarta.transaction.Transaction;

public class App {
    public static void main(String[] args) {

        // veri tabanı bağlantısı oluşturma adımı :
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libraryManagement");

        // veri tabanı entityManager tarafından yönetilme adımı :
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //System.out.println("Veri tabanı bağlantısı oluştu !");

    }
}
