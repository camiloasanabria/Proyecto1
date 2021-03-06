/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 * Esta clase contiene las funciones de los docentes
 *
 * @version 14/03/2018
 * @author cass465
 */
public class Docente extends IntegranteCurso {

    private String materias[];//array de materias docentes 

    /**
     * Constructor de Docente
     *
     * @param materias
     * @param tipoIntegrante
     * @param nombre
     * @param apellido
     * @param codigo
     */
    public Docente(String[] materias, String tipoIntegrante, String nombre, String apellido, long codigo) {
        super(tipoIntegrante, nombre, apellido, codigo);
        this.materias = materias;
    }

    /**
     * Obtener nombre del docente
     *
     * @return String
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Obtener apellido del docente
     *
     * @return String
     */
    @Override
    public String getApellido() {
        return super.getApellido();
    }

    /**
     * Obtener el array de materias que dicta el docente
     *
     * @return String[]
     */
    public String[] getMaterias() {
        return materias;
    }

}
