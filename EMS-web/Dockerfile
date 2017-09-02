FROM payara/server-full
MAINTAINER Jose Ferreira <joseifpb2015@gmail.com>
ENV DOMAIN domain1
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
ADD target/EMS-web.war  ${DEPLOY}
