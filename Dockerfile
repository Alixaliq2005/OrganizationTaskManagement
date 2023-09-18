FROM openjdk:17-alpine
COPY build/libs/OrganizationTaskManagement-0.0.1-SNAPSHOT.jar /OrganizationTaskManagement-app/
CMD ["java","-jar","/OrganizationTaskManagement-0.0.1-SNAPSHOT.jar"]