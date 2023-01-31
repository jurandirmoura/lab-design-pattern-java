package subsistema2.cep;

import com.one.digitalinnovation.singleton.SingletonEager;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
		}
		
		public static CepApi getInstancia() {
			return instancia;
		}
		
		public String recuperarCidade(String cep) {
			return "Araraquara";
			
		}
		public String recuperarEstado(String estado) {
			return "SP";
			
		}
}
