public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "BASIC";

		switch (sigla) {
		case "BASIC":{
			System.out.println("PEQUENO");
			break;
		}
		case "MIDIA":{
			System.out.println("MÉDIO");
			break;
		}
		case "TURBO":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
