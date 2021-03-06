/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.test.mycomponent.demo;

import com.vaadin.flow.router.HasChildView;
import com.vaadin.flow.router.View;
import com.vaadin.router.RouterLink;
import com.vaadin.ui.Component;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Text;
import com.vaadin.ui.common.StyleSheet;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H1;
import com.vaadin.ui.html.H2;

/**
 * The main view contains a menu and a container for either of the hello world
 * variants.
 */
@StyleSheet("context://styles.css")
public class MainView extends Composite<Div> implements HasChildView {

    private Div container;

    public MainView() {
        // Guiding texts
        H1 heading = new H1("3 ways to say Hello");
        Text intro = new Text(
                "Three different ways of implementing Hello World using Vaadin Flow");

        // Create links to each of the different sub views
        RouterLink template = new RouterLink("Template",
                HelloWorldTemplate.class);
        template.setId("template-link");

        RouterLink components = new RouterLink("Component",
                HelloWorldComponent.class);
        components.setId("components-link");

        RouterLink elements = new RouterLink("Element",
                HelloWorldElement.class);
        elements.setId("elements-link");

        // Set up the container where sub views will be shown
        container = new Div();
        container.addClassName("container");

        getContent().addClassName("main-view");
        getContent().add(heading, intro, template, components, elements,
                container);
    }

    @Override
    public void setChildView(View childView) {
        // Update what we show whenever the sub view changes
        container.removeAll();

        if (childView != null) {
            container.add(new H2(childView.getTitle(null)));
            container.add((Component) childView);
        }
    }
}
