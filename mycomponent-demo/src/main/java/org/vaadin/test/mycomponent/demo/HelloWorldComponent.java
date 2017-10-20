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

import org.vaadin.test.mycomponent.MyComponentElement;

import com.vaadin.flow.router.View;
import com.vaadin.router.Title;
import com.vaadin.ui.Composite;
import com.vaadin.ui.html.Div;

/**
 * Hello World view based on components. This is a composite based on a div
 * component.
 */
@SuppressWarnings("serial")
@Title("Hello World with components")
public class HelloWorldComponent extends Composite<Div> implements View {
    /**
     * Creates the hello world Components API based component.
     */
    public HelloWorldComponent() {
        MyComponentElement element = new MyComponentElement();

        element.setGreeting("Please enter your name");
                
        /*
         * Add the input and the greeting to the Div component that makes up the
         * content of this Composite subclass
         */
        getContent().add(element);
    }

}
