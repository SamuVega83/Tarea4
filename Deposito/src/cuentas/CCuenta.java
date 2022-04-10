package cuentas;

/**
 * Esta clase define la cuenta de los usuarios con su nombre, número, saldo y tipo de interés
 * incluye los métodos para consultar, ingresar y retirar saldo
 * @author SamuVega83
 * @version Primera Versión
 * @since Sat Apr 9
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    //Declaración de los atributos privados
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Método constructor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Método constructor
     * @param nom nombre del usuario de la cuenta
     * @param cue número de la cuenta (de tipo String)
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el saldo llamando al getter del atributo
     * @return getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar saldo en cuenta
     * lanza una excepción si la cantidad a ingresar es menor que cero
     * @param cantidad importe a ingresar
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar saldo de cuenta
     * lanza una excepción si la cantidad a retirar es menor o igual que cero
     * @param cantidad importe a ingresar 
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
