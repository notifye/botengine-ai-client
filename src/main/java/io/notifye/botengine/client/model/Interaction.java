package io.notifye.botengine.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.notifye.botengine.client.model.enums.InteractionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public @Data class Interaction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonIgnore
	private InteractionType type;
	
	@JsonProperty("action")
	private String action;
	
	@JsonProperty("triggers")
	private List<String> triggers;
	
	@JsonProperty("userSays")
	private List<String> userSays;
	
	@JsonIgnore
	private List<Entity> entities = new CopyOnWriteArrayList<Entity>(new ArrayList<Entity>());
	
	@JsonProperty(value = "parameters")
	private List<Parameter> parameters;
	
	@JsonProperty("responses")
	private List<ResponseInteraction> responses;
	
	@JsonIgnore
	private List<Interaction> childs;
	
	public Interaction addChild(Interaction childInteraction){
		Objects.requireNonNull(childInteraction, "Argument childInteraction is empty");
		if(childs == null){
			childs = new CopyOnWriteArrayList<Interaction>(new ArrayList<Interaction>());
		}
		childs.add(childInteraction);
		return this;
	}

	
}
