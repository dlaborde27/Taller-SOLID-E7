package SeccionB;

public class Gato implements Animal{
	public String nombre;
	public String altura;
	@Override
	public void sonidoEmitido() {
		System.out.println("Maullido");
	}
}
