package ro.ase.csie.cts.g1092.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		/*
		 * PlayerProfile profile = new PlayerProfile();
		 * profile.login();
		 * profile.getUserSettings();
		 * 

		 * Subscription subscription = new Subscription();
		 * subscription.checkSubscription();
		 */

		GameAPIFacade.createProfileAndConnect();

		SuperHero superHero = new SuperHero("Superman", new Helmet(), new SuperPower());
		
	}

}