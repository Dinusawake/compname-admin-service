package com.compname.admin.service.assembler;

import com.compname.admin.service.dto.AdminDTO;
import com.compname.admin.service.entity.AdminEntity;

public class AdminAssembler {

	
	
	public AdminDTO entityToDTO(AdminEntity adminEntity)
	{
		
		
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setAdminId(adminEntity.getAdminId());
		adminDTO.setAdminFirstName(adminEntity.getAdminFirstName());
		adminDTO.setAdminLastName(adminEntity.getAdminLastName());
		adminDTO.setAdminAddress(adminEntity.getAdminAddress());
		adminDTO.setAdminBankAccountNumber(adminEntity.getAdminBankAccountNumber());
		adminDTO.setAdminContactNumber(adminEntity.getAdminContactNumber());
		
		return adminDTO;
	}
	
	public AdminEntity dtoToEntity(AdminDTO adminDTO)
	{
		AdminEntity adminEntity = new AdminEntity();
		adminEntity.setAdminId(adminDTO.getAdminId());
		adminEntity.setAdminAddress(adminDTO.getAdminFirstName());
		adminEntity.setAdminLastName(adminDTO.getAdminLastName());
		adminEntity.setAdminBankAccountNumber(adminDTO.getAdminBankAccountNumber());
		adminEntity.setAdminAddress(adminDTO.getAdminAddress());
		adminEntity.setAdminContactNumber(adminDTO.getAdminContactNumber());
		
		return adminEntity;
}
}
