
public class EsempioException {
	public static void main(String[] args) {
		EsempioException esempio = new EsempioException();
		esempio.testSet();
		esempio.testMap();
		esempio.testException();
	

	}

	private void testException() {
		
		int valore = 0;
		System.out.println("inizio prova");
		try {
			
			valore +=5;
			
			System.out.println("valore:"+valore);
			
			valore -=5;
			
			System.out.println("valore:"+valore);
			
			double risultato = valore/0;
			
			System.out.println("risultato:"+risultato);
		}catch(Exception e) {
			System.err.println("si � verificato un errore: "+e.getLocalizedMessage());
			e.printStackTrace();
		}finally {
			System.out.println("operazioni finali");
		}
		
	}
}
