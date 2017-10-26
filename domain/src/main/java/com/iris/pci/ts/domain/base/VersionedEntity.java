package com.iris.pci.ts.domain.base;

public class VersionedEntity extends BaseEntity {

	private long version = 0;
	
	long getVersion() {
		return version;
	}

}
