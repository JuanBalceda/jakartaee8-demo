# jakartaee8-demo
Jakarta EE 8 Sample projects

## Context and Dependency Injection API (CDI 2.0)

Dependency Injection (DI) is a specific form of Inversion of Control (IoC), IoC is a software pattern where individual components have their dependencies supplied to them instead of creating them themselves.
This is the way of externalising application dependencies to a container that will manage their context and life cycle.

### Features:
- Typesafe Dependency
- Lifecycle Context
- Interceptors
- Events
- Service Provider Interface (SPI)

### Bean discovery mode
- All
- Annotated
- None

### CDI Container
Is a blackbox, a factory that manages the context and lifecycle of all the application beans, takes the java classes and adds a set of specific features.
Scans the application at boot time and makes sure that all dependencies are met.

### Beans and Contextual Instance
A Bean is a template for creating contextual instances, is created by the developer.

A contextual instance is derived from a Bean, is created and managed by CDI container. 

### CDI Injection Point
Is the legal place where the container can create and inject a contextual instance of a bean.
- Field injection
- Constructor Injection
- Method Injection

### CDI Lifecycle Callbacks
- PostConstruct, once the bean is ready to use, after all injections have taken place.
- PreDestroy, before the bean is available for garbage collection.

### Managed Beans and Bean Types
A managed bean is any bean eligible for CDI injection and managed by the CDI container

A bean type refers to the concrete type that a bean is related to. 

### CDI Qualifiers
An annotation that helps resolve a contextual instance, avoids ambiguities at runtime.

### CDI Stereotypes
A collection of annotations grouped together used as one

### CDI Scopes and Contexts
A scope refers to the lifetime of the bean

A context is a valid environment where the contextual instance can be created and reside in.

This is the way to tell the container to associate a specific contextual instance with a given context

- Dependent Scope 
    - It is the default scope, beans are bound to the scope of the bean in which are injected
- Request Scope 
    - Beans are bound to the HTTP request
- Session scope 
    - Beans are bound to the HTTP session
- Application Scope 
    - Beans are bound to the lifetime of the application
- Conversation Scope 
    - Used in JSF, beans are bound to a context similar to a session scope, but it's manually managed by the developer.

### CDI Producers
It's an API contract that enable developers to turn classes into injectable beans, 
qualifiers can be used to avoid ambiguity.

- Producer Method (Must not be a void method)
- Producer Field

#### Disposes Annotation
Passes a produced bean to a method (Must be a void method) that allows the developer to do custom cleanups before the context instance is destroy. 

### CDI Interceptors
An interceptor is a class used to interpose in method invocations or lifecycle events that occur in an associated target class. 
The interceptor performs cross-cutting concern tasks.

#### Interceptor Binding Code
It's the code that will run when a method invocation is intercepted.

### CDI Events
Events allow beans to communicate without any compile-time dependency. 
One bean can define an event, another bean can fire the event, and yet another bean can handle the event. 

- An event consists of the following: 
    - The event object payload, a Java object
    - Zero or more qualifier types, the event qualifiers.
- An event handler uses an observer method to consume events, observers can be sync or async and prioritized.

## Java Persistence API (JPA 2.3)

...Coming Soon

## Java API for Rest Web Services (JAX-RS 2.1)

...Coming Soon
