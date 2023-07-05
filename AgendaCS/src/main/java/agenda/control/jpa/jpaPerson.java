
package agenda.control.jpa;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import agenda.model.Person;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author odali
 */
public class jpaPerson {
  private ObservableList<person> datopersona = FXCollections.observableArrayList();
    private Object nuevaPerson;

    public ObservableList<person> getDatoEstudiantes() {
        return datopersona;
    }
    private EntityManagerFactory emf;

    public jpaPerson() {
        this.emf = Persistence.createEntityManagerFactory("BaseDatos");
    }
      public Object InsertarPerson() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<person> query = (TypedQuery<person>) em.createQuery("SELECT e FROM Estudiante e", (Class<T>) Person.class);
            List<person> estudiantes = query.getResultList();

            // Agregar los estudiantes a la lista observable
            nuevaPerson.clear();
            nuevaPerson.addAll(estudiantes);

            return nuevaPerson;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return nuevaPerson;
    }
    public void insertarEstudiante(Person Person) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(person);
            tx.commit();
            System.out.println("Contacto agregado correctamente: " + person.getFirstName());
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
