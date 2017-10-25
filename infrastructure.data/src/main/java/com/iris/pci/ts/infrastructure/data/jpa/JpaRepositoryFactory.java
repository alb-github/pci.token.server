package com.iris.pci.ts.infrastructure.data.jpa;

import com.iris.pci.ts.repositories.ApplicationRepository;
import com.iris.pci.ts.repositories.CompanyRepository;
import com.iris.pci.ts.repositories.RepositoryFactory;
import com.iris.pci.ts.repositories.TokenRepository;
import com.iris.pci.ts.repositories.TokenRequesterRepository;

public class JpaRepositoryFactory implements RepositoryFactory {

	public ApplicationRepository getApplicationRepository() {
		return new ApplicationJpaRepository();
	}

	public CompanyRepository getCompanyRepository() {
		return new CompanyJpaRepository();
	}

	public TokenRequesterRepository getTokenRequesterRepository() {
		return new TokenRequesterJpaRepository();
	}

	public TokenRepository getTokenRepository() {
		return new TokenJpaRepository();
	}

}
