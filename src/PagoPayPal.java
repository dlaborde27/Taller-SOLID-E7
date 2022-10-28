
public class PagoPayPal implements Payable{
	private boolean loggedIn; //conexion a cuenta PayPal
	
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			login();
		}
		//carga el monto de compra del medio de pago
	}
	public void login(){
		//solicita y valida el login de la cuenta
	}
}

