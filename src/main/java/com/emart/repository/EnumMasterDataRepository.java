package com.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.model.EnumMasterData;

public interface EnumMasterDataRepository extends JpaRepository<EnumMasterData, Integer> {
	
	
//	@Query("SELCET e from EnumMasterData e where LOWER(e.enumTypeId)=:enumType")
//	List<EnumMasterData> fetchMasterDataByType(@Param("enumType") String enumType);
//	
 	@Query("SELECT e from EnumMasterData e where LOWER(e.enumTypeId)=:enumType")
	List<EnumMasterData> fetchMasterDataByType(@Param("enumType") String enumType);



}
