package io.notifye.botengine.client.action;

import io.notifye.botengine.client.bots.Bot;
import io.notifye.botengine.client.model.Interaction;

public interface InteractionAction extends Action {
	
	public InteractionAction add();
	public InteractionAction welcome(Interaction welcomeInteraction);
	public InteractionAction fallback(Interaction fallbackInteraction);
	public InteractionAction interaction(Interaction interaction);
	
	/*public InteractionAction welcome(Story story, Interaction welcomeInteraction);
	public InteractionAction fallback(Story story, Interaction fallbackInteraction);
	public InteractionAction interaction(Story story, Interaction interaction);*/
	public Bot build();

}