#!/usr/bin/env bash

##
## Initialize docker-compose.yml files
##
COMPOSE_FILES=mogodb-server.docker-compose.yml
COMPOSE_FILES="$COMPOSE_FILES -f mysql.docker-compose.yml"
BUILD="--build"
##
## function to stop all Docker containers
##

function stop () {
  echo "==== Shutdown previous running  msysql-mongodb instances ===="
  docker-compose -f $COMPOSE_FILES down || true
}

##
## function to start all Docker containers
##

function start () {
  echo "==== Starting new msysql-mongodb instances ===="
  docker-compose -f $COMPOSE_FILES up -d $BUILD|| true
}

stop
start
