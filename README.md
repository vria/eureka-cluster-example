# Example of Eureka cluster

A `Gateway` service discovers the coordinates of a `Feed` service instance via Eureka
server. Then it uses Cloud Feign to make HTTP request to retrieve a feed.

# Single Eureka instance

Create three Run Configurations in your IDE for three modules: `eureka-server`, `feed`, `gateway`.

Visit `http://localhost:9000` to see all registered services in Eureka.

Visit `http://localhost:9020` to see the `gateway` service's result.

# Eureka Cluster with Docker

```bash
./mvnw install
docker-compose up -d
```

Visit `http://localhost:9001` and `http://localhost:9002` to see all registered services
in two instances of Eureka.

Visit `http://localhost:9020` to see the `gateway` service's result.

Note that the `feed` service is registered in the `eureka-server1` container while the 
`gateway` is registered in the `eureka-server2`. And still the `gateway` can reach the
`feed`.
