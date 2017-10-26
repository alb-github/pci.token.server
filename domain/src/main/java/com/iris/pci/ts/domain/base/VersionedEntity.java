package com.iris.pci.ts.domain.base;

public class VersionedEntity extends BaseEntity {

	private Long version;
	
	Long getVersion() {
		return version;
	}

}
