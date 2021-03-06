package com.gestaobhmap.model;

import java.io.Serializable;

public class APITokenPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Long userId;
    protected Long userApplicationId;
    protected Long apiId;

    public APITokenPK() {}

	public APITokenPK(Long id, Long userId, Long userApplicationId, Long apiId) {
		super();
		this.userId = userId;
		this.userApplicationId = userApplicationId;
		this.apiId = apiId;
	}

    // hashCode
	public boolean equals(APIToken apiToken) {
		
		return (this.userId == apiToken.getUserId() && this.userApplicationId == apiToken.getUserApplicationId() && this.userId == apiToken.getUserId());
	}
    
}