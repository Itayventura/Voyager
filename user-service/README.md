to run postgres locally on your machine run the following command:

`docker run --name mypostgres -e POSTGRES_PASSWORD=mypassword -e POSTGRES_USER=postgres -e POSTGRES_DB=db -p 5432:5432 -d postgres`