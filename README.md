# Exploring AWS SpringBoot with [Serverless](https://www.serverless.com/) Framework 

As part of enterprise migration for one of our projects, we wanted to migrate couple of Spring Boot(2.x) REST Microservices to AWS. We explored different options in AWS as to using Elastic Beanstalk, Lambda with API Gateway and EC2. Although we eventually went with AWS EC2 option following Lift-and-Shift migration strategy, I really liked using the [Serverless](https://www.serverless.com/)  framework to be used with Lambda. 

It's a no non-sense framework that allows you to deploy your app to many Serverless options available in cloud ( AWS Lambda, GCP Cloud Functions, Azure Functions etc. ) so you can focus on code. 

The simple SpringBoot project uses AWS Serverless Java Container library provided by AWS. 
I used the instructions by AWS Labs to setup the SpringBoot project to be used with AWS Lambda  [here](https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot) 

Use the [instructions](https://www.serverless.com/framework/docs/getting-started/) to setup the Serverless framework 

You will also need to configure AWS credentials with Serverless using these [instructions](https://www.serverless.com/framework/docs/providers/aws/cli-reference/config-credentials/). The AWS user will need to have read, write, delete permissions for these AWS services - S3, Cloudformation, Lambda, API gateway, IAM at the mininum for this project. 

Entire magic happens in serverless.yml file in project root dir. This is where you define all the mappings and dependencies. Checkout [Serverless](https://www.serverless.com/framework/docs/providers/aws/guide/serverless.yml/#serverlessyml-reference/) section on more details about this file and how to configure. 

Once all of this is done go to project root dir and run 
```
mvn clean package
```
when your project is built successfully then run 
```
sls deploy
```
Once the Lambda function is deployed successfully, you can hit the API on your terminal. The API is a simple GET request and returns a Java UUID 
e,g,
```
curl -X GET https://<your-code>.execute-api.us-east-1.amazonaws.com/dev/util/uid
would return something like
1e973a79-b3cf-47af-8dd3-f80dff62b1ca
```
Serverless internally uses cloud formation to create and deploy your resources. 

If you make a code change, just build your project again on local and deploy again.  Thats it!! 

Happy Coding : ) with Serverless

