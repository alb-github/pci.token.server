package com.iris.pci.ts.domain.model;

import java.time.LocalDate;
import java.util.UUID;

import com.iris.pci.ts.domain.base.BaseEntity;

public class Token extends BaseEntity {
	
	private UUID uuid;
	private String keyId;
	private String encryptedPan;
	
	private LocalDate created = LocalDate.now();
	private LocalDate validThru;
	private LocalDate lastUsed;
	
	private TokenRequester requester;
	
	Token() {}
	
	public Token(String encryptedPan, String keyId) {
		this.uuid = UUID.randomUUID();
		this.keyId = keyId;
		this.encryptedPan = encryptedPan;
	}

	public Token(String encryptedPan, String keyId, LocalDate validThru) {
		this( encryptedPan, keyId );
		this.validThru = validThru;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getKeyId() {
		return keyId;
	}

	public String getEncryptedPan() {
		lastUsed = LocalDate.now();  // Not sure about this ??
		return encryptedPan;
	}

	public LocalDate getCreated() {
		return created;
	}

	public LocalDate getValidThru() {
		return validThru;
	}

	public LocalDate getLastUsed() {
		return lastUsed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		Token other = (Token) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Token [uuid=" + uuid + ", "
				+ "keyId=" + keyId 
				+ ", encryptedPan=" 
				+ encryptedPan 
				+ ", created=" + created
				+ ", validThru=" + validThru 
				+ ", lastUsed=" + lastUsed + "]";
	}

	public TokenRequester getRequester() {
		return requester;
	}

	void _setRequester(TokenRequester requester) {
		this.requester = requester;
	}

}
