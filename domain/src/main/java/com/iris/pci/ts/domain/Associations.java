package com.iris.pci.ts.domain;

public class Associations {

	public static class TokenRequest {

		public static void link(Application application, 
				TokenRequester tokenRequester, 
				Company company) {
			
			tokenRequester._setApplication( application );
			tokenRequester._setCompany( company );
			
			application._getTokenRequesters().add( tokenRequester );
			company._getTokenRequesters().add( tokenRequester );			
		}
		
		public static void unlink(TokenRequester tokenRequester) {
			Application a = tokenRequester.getApplication();
			Company c = tokenRequester.getCompany();
			
			a._getTokenRequesters().remove( tokenRequester );
			c._getTokenRequesters().remove( tokenRequester );			

			tokenRequester._setApplication( null );
			tokenRequester._setCompany( null );
			
		}

	}

}
