package com.iris.pci.ts.repositories;

public interface RepositoryFactory {
	
	ApplicationRepository getApplicationRepository();
	CompanyRepository getCompanyRepository();
	TokenRequesterRepository getTokenRequesterRepository();
	TokenRepository getTokenRepository();

}
