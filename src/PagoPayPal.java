
public class PagoPayPal implements Pago{
	private boolean loggedIn; //conexion a cuenta PayPal
	private String user;
	private String password;
	
	public PagoPayPal(String user, String password) {
		//Hace el logIn de la cuenta
	}
	
	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			
		}
		// carga el monto de compra del medio de pago
	}
	
}
