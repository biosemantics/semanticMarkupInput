package edu.arizona.biosemantics.etcsite.client.content.input.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class SemanticMarkupInput implements EntryPoint {

	@Override
	public void onModuleLoad() {
		InputView view = new InputView();
		InputPresenter presenter = new InputPresenter(view);
		RootPanel.get().add(view);
		
	}

}
