package SeccionB;

public class Perro implements Animal{
	public double peso;
	public String raza;
	@Override
	public void sonidoEmitido() {
		System.out.println("Ladrido");
	}
}
