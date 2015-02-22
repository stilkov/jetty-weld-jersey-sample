Minimal web app combining CDI (Weld), JAX-RS (Jersey) and Jetty

After spending more time than I care to admit hunting for the right
combination of Maven, web.xml and Jetty settings, I thought it might
make sense to put this online somewhere.

Build and start it with `mvn jetty:run`, then connect to the running
server at http://localhost:8080/plain and http://localhost:8080/cdi and
you should see a result generated without and with CDI.

