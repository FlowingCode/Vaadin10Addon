# MyComponent Add-on for Vaadin 10

MyComponent is a UI component add-on for Vaadin 10.

## Online demo

Try the add-on demo at <url of the online demo>

## Download release

(soon)

## Building and running demo

git clone <url of the MyComponent repository>
mvn clean install
cd mycomponent-demo
mvn jetty:run

To see the demo, navigate to http://localhost:8080/

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:
- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- JRebel Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine. 

### Debugging server-side

If you have a JRebel license, it makes on the fly code changes faster. Just add JRebel nature to your mycomponent-demo project by clicking project with right mouse button and choosing JRebel > Add JRebel Nature

To debug project and make code modifications on the fly in the server-side, right-click the mycomponent-demo project and choose Debug As > Debug on Server. Navigate to http://localhost:8080/mycomponent-demo/ to see the application.

## Release notes

### Version 1.0-SNAPSHOT
- ...

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:
- ...

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

MyComponent is written by Martin Lopez

# Developer Guide

## Getting started

Here is a simple example on how to try out the add-on component:

<...>

For a more comprehensive example, see ...

## Features

### Feature A

<...>

### Feature B

<...>

### Feature C

<...>

## API

MyComponent JavaDoc is available online at <...>
