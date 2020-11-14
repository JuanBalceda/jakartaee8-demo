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

- Dependent Scope (Default, beans are bound to the scope of the bean in which are injected)
- Request Scope (Beans are bound to HTTP request)
- Session scope (Beans are bound to HTTP session)
- Application Scope (Beans are bound to the lifetime of the application)
- Conversation Scope (Beans are bound to HTTP request)

## Java Persistance API (JPA 2.3)

...Coming Soon

## Java API for Rest Web Services (JAX-RS 2.1)

...Coming Soon
