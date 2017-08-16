package io.notifye.botengine.action.controller;

import io.notifye.botengine.Engine;
import io.notifye.botengine.action.QueryAction;
import io.notifye.botengine.model.Query;
import io.notifye.botengine.model.QueryResponse;
import io.notifye.botengine.model.Story;
import io.notifye.botengine.security.Token;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final @Data class QueryController implements QueryAction {
	
	private final Story story;
	private final Token token;
	private final String session;
	
	@Override
	public QueryResponse q(String query) {
		return Engine.query(this.story, query, token, session);
	}

	@Override
	public QueryResponse q(Story story, String query) {
		return Engine.query(story, query, token, session);
	}

	@Override
	public QueryResponse q(Query query) {
		return Engine.query(query, token, session);
	}

	@Override
	public QueryResponse q(Story story, Query query) {
		return Engine.query(story, query, token, session);
	}

}