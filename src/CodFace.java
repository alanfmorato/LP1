
public class CodFace {
	
	private String txtData;
	private String txtHora;
	private String txtBatimento;
	private String txtTemperatura;
	
	public CodFace() {
		
	}
	
	public CodFace(String txtData, String txtHora, String txtBatimento, String txtTemperatura){
		this.txtData = txtData;
		this.txtHora = txtHora;
		this.txtBatimento = txtBatimento;
		this.txtTemperatura = txtTemperatura;
		

	}
    
    public String gettxtData(){
        return txtData;
    }
    public void settxtData(String txtData){
        this.txtData = txtData;
    }
    public String gettxtHora(){
        return txtHora;
    }
    public void settxtHora(String txtHora){
        this.txtHora = txtHora;
        
    }
    public String gettxtBatimento(){
        return txtBatimento;
    }
    public void settxtBatimento(String txtBatimento){
        this.txtBatimento = txtBatimento;
    }
    public String gettxtTemperatura(){
        return txtTemperatura;
    }
    public void settxtTemperatura(String txtTemperatura){
        this.txtTemperatura = txtTemperatura;
    }
    public void status(){
        System.out.println("Data: " + this.txtData);
        System.out.println("Hora: " + this.txtHora);
        System.out.println("Batimento: " + this.txtBatimento);
        System.out.println("Temperatura: " + this.txtTemperatura);
    }
    

}
