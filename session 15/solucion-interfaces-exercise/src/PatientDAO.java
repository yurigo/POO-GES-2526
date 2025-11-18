import java.util.List;

public interface PatientDAO {
    void save(List<Paciente> toSave);
    List<Paciente> load();
}
