package SeccionB;

public class PagoPayPal implements Pago{
	
	private boolean loggedIn; //conexion a cuenta PayPal
	
	@Override
	public void realizarCobro(Factura factura) {
		if(!loggedIn) {
			login();
		}
		//carga el monto de compra del medio de pago
	}
	public void login(){
		//solicita y valida el login de la cuenta
	}
}

