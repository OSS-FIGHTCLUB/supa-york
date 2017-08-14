YORKU REVAMPED WEBAPP
=====================

The purpose of this project is to create an enhanced experience for students at the university.
Part of the goals are:

Streamline course selections via:

-[ ] Course selection times
-[ ] Commute integration
-[ ] Ratemyprof integration (kek)
-[ ] Weighted course load feature, wherein course load is adjusted via  a weight
-[ ] Community-driven course reviews, notes and resources

Allow for long term planning via:

-[ ] Planning around coop and internships
-[ ] Reaching all required courses and credits (degree checklist, but not shit)
-[ ] Creating a personal course list (???) (similar to above)
-[ ] Show restrictions (including prereqs)

This is a work in progress



This is your new Play application
=================================

Controllers
===========

- HomeController.java:

  Shows how to handle simple HTTP requests.

- AsyncController.java:

  Shows how to do asynchronous programming when handling a request.

- CountController.java:

  Shows how to inject a component into a controller and use the component when
  handling requests.

Components
==========

- Module.java:

  Shows how to use Guice to bind all the components needed by your application.

- Counter.java:

  An example of a component that contains state, in this case a simple counter.

- ApplicationTimer.java:

  An example of a component that starts when the application starts and stops
  when the application stops.

Filters
=======

- Filters.java:

  Creates the list of HTTP filters used by your application.

- ExampleFilter.java

  A simple filter that adds a header to every response.


## Resources
https://www.playframework.com/documentation/2.6.x/JavaHome
https://www.youtube.com/watch?v=8z3h4Uv9YbE