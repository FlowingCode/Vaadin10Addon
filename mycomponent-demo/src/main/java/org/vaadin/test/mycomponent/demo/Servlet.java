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

import javax.servlet.annotation.WebServlet;

import org.vaadin.test.mycomponent.demo.Servlet.MyRouterConfigurator;

import com.vaadin.flow.router.RouterConfiguration;
import com.vaadin.flow.router.RouterConfigurator;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletConfiguration;

/**
 * The main servlet for the application.
 * <p>
 * It is not mandatory to have the Servlet, since Flow will automatically register a Servlet to any app with at least one {@code @Route} to server root context.
 */
@WebServlet(urlPatterns = "/*", name = "UIServlet", asyncSupported = true)
@VaadinServletConfiguration(routerConfigurator = MyRouterConfigurator.class, productionMode = false)
public class Servlet extends VaadinServlet {

    /**
     * The router configurator defines the how to map URLs to views.
     */
    public static class MyRouterConfigurator implements RouterConfigurator {
        @Override
        public void configure(RouterConfiguration configuration) {
            /*
             * For the root, only show the main view without any sub view
             */
            configuration.setRoute("", MainView.class);

            /*
             * For any of the specific routes, show a particular view inside the
             * main view
             */
            configuration.setRoute("template", HelloWorldTemplate.class,
                    MainView.class);
            configuration.setRoute("component", HelloWorldComponent.class,
                    MainView.class);
            configuration.setRoute("element", HelloWorldElement.class,
                    MainView.class);
        }
    }
}
