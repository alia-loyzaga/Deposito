package cuentas;
/**
 * Clase que representa a una cuenta bancaria.
 * Permite realizar operaciones básicas como consultar el saldo,
 * ingresar y retirar dinero.
 */

public class CCuenta {
	
    /**
     * Nombre del titular de la cuenta.
     */
	private String nombre;
	/**
	 * Nombre de la cuenta.
	 */
    private String cuenta;
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInterés;
    
    /**
     * Constructor por defecto.
     */

    public CCuenta()
    {
    }
    
    //metodos de acceso a atributos.
    
    /**
     * Devuelve el nombre del titular
     * @return nombre del titular
     */
    public String getNombre() {
    	return nombre;
    	
    }
    /**
     * Establece el nombre del titulas
     * @param nombre del titular
     */
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
     * Devuelve el nombre de la cuenta bancaria
     * @return nombre de la cuenta bancaria.
     */
    public String getCuenta() {
    	return cuenta;
    	
    }
    /**
     * Establece el nombre de la cuenta bancaria
     * @param cuenta, que es el nombre de la cuenta
     */
    public void setCuenta(String cuenta) {
    	this.cuenta = cuenta;
    }
    /**
     * Devuelve el saldo actual
     * @return saldo actual
     */

    public double getSaldo() {
    	return saldo;
    	
    }
    /**
     * Establece el saldo de la cuenta
     * @param saldo de la cuenta
     */
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    /**
     * Devuelve el tipo de interés
     * @return tipo de interés asociado
     */
    public double getTipoInterés() {
    	return tipoInterés;
    	
    }
    /**
     * Establece el tipo de interés
     * @param tipoInterés tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
    	this.tipoInterés = tipoInterés;
    }
    
    /**
     * Constructor con parámetros.
     * @param nom nombre del titular.
     * @param cue nombre de la cuenta.
     * @param sal saldo incial.
     * @param tipo tipo de interés.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   
    /**
     * Consulta el saldo de la cuenta
     * @return saldo disponible
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Ingresar una cantidad en la cuenta.
     * @param cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retirar una cantidad de la cuenta.
     * @param cantidad cantidad a retirar en la cuenta
     * @throws Exception si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
