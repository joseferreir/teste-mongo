mvn clean install 

docker rmi core
docker rmi webapp

docker build -t core ./EMS-core/
docker build -t webapp ./EMS-web/

docker run -p 27017:27017 -d --name banco mongo  
 
docker run -p 8080:8080 -d --name appcore --link banco:host-banco core -d

docker run -p 8081:8080 -d --name appweb --link appcore:host-core webapp -d
