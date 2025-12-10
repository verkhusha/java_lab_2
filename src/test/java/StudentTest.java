import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(Student.class)
                .verify();
    }
}