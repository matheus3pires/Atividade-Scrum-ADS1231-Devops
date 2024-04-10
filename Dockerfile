FROM openjdk:21

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN javac AtividadeScrum/*.java

CMD ["java", "AtividadeScrum.Main"]