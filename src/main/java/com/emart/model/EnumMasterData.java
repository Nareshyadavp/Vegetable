package com.emart.model;

 import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="enum_info")
public class EnumMasterData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int enumId;
	private String enumCode;
	private String enumTypeId;
	private String enumDiscription;
	public EnumMasterData(int enumId, String enumCode, String enumTypeId, String enumDiscription) {
		super();
		this.enumId = enumId;
		this.enumCode = enumCode;
		this.enumTypeId = enumTypeId;
		this.enumDiscription = enumDiscription;
	}
	 
	
	
	

}
