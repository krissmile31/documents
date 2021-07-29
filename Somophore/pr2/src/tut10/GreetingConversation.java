package tut10;

/**
 * @overview a simple class uses Conversation and has only one instance
 */
public class GreetingConversation {
	// a single object of this class
	private static GreetingConversation instance;
	
	/**
	 * @effects 
	 * initialise this to be an empty object
	 */
	private GreetingConversation() {
		//do nothing
	}
	
	/**
	 * @effects 
	 * if instance = null
	 *    initialise it
	 * else
	 *    return instance
	 */
	public static GreetingConversation getInstance() {
		if (instance == null)
			instance = new GreetingConversation();
		return instance;
	}
	
	
	
}
