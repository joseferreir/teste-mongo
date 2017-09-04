mvn clean install 

docker build -t jose/EMSCore ./EMS-core
docker build -t jose/EMSwebapp ./EMS-web

docker run -p 27017:27017 --name banco -d mongo  
docker run -p 8080:8080 -d --name appcore --link banco:host-banco jose/EMSCore -d
docker run -p 8081:8080 -d --name appweb --link appcore:host-core jose/EMSwebapp -d
