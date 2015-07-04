public class Encyclopedia{
	String theme;
	String editorial;
	String edition;	
	public Encyclopedia(){}
	
	public Encyclopedia(String[] array){
	theme=array[0];
	editorial=array[1];
	edition=array[2];
	}
	
	public String getEncyclopedia(){
	return String.format("\nTheme: %s \nEditorial: %s \nEdition: %s",theme,editorial,edition);
	}
}
