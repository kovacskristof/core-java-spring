package eu.arrowhead.common.dto.internal;

import java.io.Serializable;

public class GatewayProviderConnectionResponseDTO implements Serializable {

	//=================================================================================================
	// members
	
	private static final long serialVersionUID = -2685072058660027564L;
	
	private String queueId;
	private String peerName;
	private String providerGWPublicKey;
	
	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public GatewayProviderConnectionResponseDTO() {}
	
	//-------------------------------------------------------------------------------------------------
	public GatewayProviderConnectionResponseDTO(final String queueId, final String peerName, final String providerGWPublicKey) {
		this.queueId = queueId;
		this.peerName = peerName;
		this.providerGWPublicKey = providerGWPublicKey;
	}

	//-------------------------------------------------------------------------------------------------
	public String getQueueId() { return queueId; }
	public String getPeerName() { return peerName; }
	public String getProviderGWPublicKey() { return providerGWPublicKey; }

	//-------------------------------------------------------------------------------------------------
	public void setQueueId(final String queueId) { this.queueId = queueId; }
	public void setPeerName(final String peerName) { this.peerName = peerName; }
	public void setProviderGWPublicKey(final String providerGWPublicKey) { this.providerGWPublicKey = providerGWPublicKey; }
}