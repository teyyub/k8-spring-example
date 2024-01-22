FROM openjdk:8
EXPOSE 8080
ADD target/k8-cluster-0.0.1-SNAPSHOT.jar k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]