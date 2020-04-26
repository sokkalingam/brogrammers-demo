FROM alpine:3.7

RUN apk update && apk add git maven openjdk8 

WORKDIR /home/brogram

RUN git clone https://github.com/sokkalingam/brogrammers-demo

EXPOSE  8080

RUN cd brogrammers-demo