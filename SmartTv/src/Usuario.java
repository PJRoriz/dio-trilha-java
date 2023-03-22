
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada?");
		if (smartTv.ligada == false) {
			System.out.println("Smart TV: desligada");
			System.out.println("Ligar Smart TV!");
			smartTv.ligar();
			System.out.println("Smart TV: Ligada");
		}
		else {
			System.out.println("Smart TV: ligada");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Canal Atual: " + smartTv.canal);
		
		if (smartTv.canal != 12) {
			while (smartTv.canal != 12) {
				smartTv.aumentarCanal();
			}
		}
		else {
			System.out.println(smartTv.canal);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Volume atual: " + smartTv.volume);
		
		if (smartTv.volume != 25) {
			while (smartTv.volume != 25) {
				smartTv.aumentarVolume();
			}
		}
		
		else {
			System.out.println(smartTv.volume);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Status atual da Smart Tv: ");
		System.out.println("Smart Tv ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		}
	}


