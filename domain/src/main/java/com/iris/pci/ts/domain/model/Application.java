package com.iris.pci.ts.domain.model;

import java.util.HashSet;
import java.util.Set;

import com.iris.pci.ts.domain.base.VersionedEntity;

public class Application extends VersionedEntity {
	
	private String name;
	private OperationalStatus status = OperationalStatus.ENABLED;

	private Set<TokenRequester> tokenRequesters = new HashSet<>();
	
	Application() { }

	public Application(String name) {
		this.name = name;
	}
	
	public void enable() {
		this.status = OperationalStatus.ENABLED;
	}
	
	public void disable() {
		this.status = OperationalStatus.DISABLED;
	}
	
	public String getName() {
		return name;
	}

	public OperationalStatus getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Application other = (Application) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", status=" + status + "]";
	}

	Set<TokenRequester> _getTokenRequesters() {
		return tokenRequesters;
	}

	public Set<TokenRequester> getTokenRequesters() {
		return new HashSet<>( tokenRequesters );
	}
}
