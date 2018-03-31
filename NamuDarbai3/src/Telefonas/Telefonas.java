package Telefonas;

public class Telefonas {
private String marke; 
	
	private String modelis;
	
	private String atmintis; 
	
	private String spalva; 

	public Telefonas(String marke, String modelis, String atmintis, String spalva) {
		this.marke = marke;                                                          
		this.modelis = modelis;
		this.atmintis = atmintis;
		this.spalva = spalva;
	}

	public String getMarke() {    
		return marke;
	}

	public void setMarke(String marke) {   
		this.marke = marke;
	}

	public String getModelis() {
		return modelis;
	}

	public void setModelis(String modelis) {
		this.modelis = modelis;
	}

	public String getAtmintis() {
		return atmintis;
	}

	public void setAtmintis(String atmintis) {
		this.atmintis = atmintis;
	}

	public String getSpalva() {
		return spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}

	
	public void parodyk() {
		System.out.println("Telefonas [marke=" + marke + ", modelis=" + modelis + ", atmintis=" + atmintis + ", spalva=" + spalva
				+ "]");
	}
	

}
