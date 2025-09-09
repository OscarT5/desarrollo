package mx.desarrollo.delegate;

import mx.avanti.desarrollo.integration.ServiceLocator;
import mx.desarrollo.entity.Alumno;

public class DelegateAlumno {
    public void saveAlumno(Alumno alumno){
        ServiceLocator.getInstanceAlumnoDAO().save(alumno);
    }

}