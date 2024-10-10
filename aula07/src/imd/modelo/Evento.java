package imd.modelo;

import java.util.Date;

public class Evento{
    
	// Attributes
    private String name;
    private Date date;
    
    public void agendar(String name, Date date) {
        this.name = name;
        this.date = date;
    }  
        
    public String getName(){
        return name;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}       

    
}