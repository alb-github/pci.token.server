package com.iris.pci.ts.domain.model;

import java.util.HashSet;
import java.util.Set;

import com.iris.pci.ts.domain.base.VersionedEntityLink;

public class TokenRequester extends VersionedEntityLink {
	
	private Application application;
	private Company company;
	private OperationalStatus status = OperationalStatus.ENABLED;
	
	private Set<Token> tokens = new HashSet<>();
	
	TokenRequester() {}
	
	public TokenRequester(Application application, Company company) {
		Associations.TokenRequest.link(application, this, company);
	}
	
	public void enable() {
		this.status = OperationalStatus.ENABLED;
	}
	
	public void disable() {
		this.status = OperationalStatus.DISABLED;
	}
	
	public boolean isEnabled() {
		return this.status.equals( OperationalStatus.ENABLED );
	}
	
	public OperationalStatus getStatus() {
		return status;
	}

	public Application getApplication() {
		return application;
	}

	public Company getCompany() {
		return company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((application == null) ? 0 : application.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenRequester other = (TokenRequester) obj;
		if (application == null) {
			if (other.application != null)
				return false;
		} else if (!application.equals(other.application))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TokenRequester [application=" + application 
				+ ", company=" + company 
				+ ", status=" + status + "]";
	}

	void _setApplication(Application a) {
		this.application = a;
	}

	void _setCompany(Company c) {
		this.company = c;
	}

	Set<Token> _getTokens() {
		return tokens;
	}
	
	public Set<Token> getTokens() {
		return new HashSet<>( tokens );
	}
	
}
