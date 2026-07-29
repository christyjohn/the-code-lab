## Create Docker image
```bash

mvnw jib:build (build and push to dockerhub)
mvn compile jib:dockerBuild (just build, need docker desktop)

docker run -p 8080:8080 chrystejon/bookmarker-api:<tag>
```