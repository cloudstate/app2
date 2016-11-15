FROM ubuntu

COPY build/app_opt_jre/ /jre/

CMD ["jre/bin/java", "-m", "app" ]

