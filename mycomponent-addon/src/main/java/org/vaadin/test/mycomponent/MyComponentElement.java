package org.vaadin.test.mycomponent;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.event.Synchronize;

@SuppressWarnings("serial")
@Tag("mycomponent-element")
@HtmlImport("frontend://mycomponent/mycomponent-element.html")
public class MyComponentElement extends Component {
	
    @Synchronize("value-changed")
    public String getName() {
        return getElement().getProperty("name", "");
    }
    
    public void setName(String name) {
    	getElement().setProperty("name", name);
    }

    @Synchronize("value-changed")
    public String getGreeting() {
        return getElement().getProperty("greeting", "");
    }

    public void setGreeting(String greeting) {
    	getElement().setProperty("greeting", greeting);
    }

}
